package com.unmsm.busqueda;

import com.unmsm.busqueda.prioridad.Prioridad;
import com.unmsm.busqueda.prioridad.PrioridadDerechaIzquierda;
import com.unmsm.busqueda.prioridad.PrioridadIzquierdaDerecha;
import com.unmsm.busqueda.evaluacion.CostoEntreEstados;
import com.unmsm.busqueda.evaluacion.CostoPorDefecto;
import java.util.List;

/**
 * Clase que busca segun una estrategia de busqueda
 * escogida definiendo la estructura del algoritmo
 * de una busqueda en un arbol
 *
 * @author Arthur Mauricio Delgadillo
 * @see EstrategiaBusqueda
 * 
 */
public class ArbolBusqueda implements Busqueda {
    private int conteoBusqueda;
    private CostoEntreEstados calculaCosto;
    private EstrategiaBusqueda estrategiaBusqueda;
    
    public ArbolBusqueda(EstrategiaBusqueda estrategiaBusqueda){
        this.estrategiaBusqueda = estrategiaBusqueda;
    }
    
    public ArbolBusqueda conCostoEntreEstados(CostoEntreEstados calculaCosto) {
        this.calculaCosto = calculaCosto;
        return this;
    }
        
    @Override
    public Camino buscar(Estado estadoInicial) {
        inicializar(estadoInicial);

        while (existeCandidato()) {
            NodoDeBusqueda candidato = escogerCandidato();

            if (!esMeta(candidato)) {
                expandirArbol(candidato);
                conteoBusqueda++;
            } else {
                return obtenerCaminoASolucion(candidato);
            }
        }

        return Camino.obtenerCaminoVacio();
    }
    
    private void inicializar(Estado estadoInicial) {
        conteoBusqueda = 1;
        estrategiaBusqueda.inicializar();
        agregarCandidato(obtenerRaiz(estadoInicial));
        inicializarCostoEntreEstados();
    }
    
    private void agregarCandidato(NodoDeBusqueda candidato){
        estrategiaBusqueda.agregarCandidato(candidato);
    }
    
    private boolean existeCandidato(){
        return estrategiaBusqueda.existeCandidato();
    }
    
    private NodoDeBusqueda escogerCandidato(){
        return estrategiaBusqueda.escogerCandidato();
    }
    
    private NodoDeBusqueda obtenerRaiz(Estado estado){
        return new NodoDeBusqueda(estado);
    }
    
    private void inicializarCostoEntreEstados() {
        if (calculaCosto == null) {
            calculaCosto = new CostoPorDefecto();
        }
        NodoDeBusqueda.costoEntreEstados = calculaCosto;
    }
    
    private boolean esMeta(NodoDeBusqueda nodoABuscar) {
        return nodoABuscar.getEstadoActual().esMeta();
    }

    /*
     * Recorrer los sucesores, envolverlos en un NodoDeBusqueda, 
     * comprobar si ya han sido evaluados, y si no, agregarlos a
     * la cola
     */
    private void expandirArbol(NodoDeBusqueda nodoEnExpansion) {
        agregarNodos(nodoEnExpansion, estrategiaBusqueda.expandirSucesores(nodoEnExpansion));
    }

    private void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores){
        estrategiaBusqueda.agregarNodos(nodoEnExpansion, sucesores);
    }
    
    /*
     * Método de ayuda para revisar si un NodoDeBusqueda ya fue evaluado.
     * Devuelve true si es así, false en caso contrario.
     */
    protected boolean esRepetido(NodoDeBusqueda n) {
        boolean resultado = false;
        NodoDeBusqueda nodoARevisar = n;

        // Mientras el padre de n no sea null, revisar si este es igual
        // al nodo que estamos buscando.
        while (n.getPadre() != null && !resultado) {
            if (n.getPadre().getEstadoActual().igual(nodoARevisar.getEstadoActual())) {
                resultado = true;
            }
            n = n.getPadre();
        }

        return resultado;
    }

    private Camino obtenerCaminoASolucion(NodoDeBusqueda nodoTemp) {
        Camino caminoSolucion = new Camino();
        do {
            caminoSolucion.add(nodoTemp);
            nodoTemp = nodoTemp.getPadre();
        } while (nodoTemp != null);
        return caminoSolucion;
    }

    @Override
    public int getConteoBusqueda() {
        return conteoBusqueda;
    }
}
