package com.unmsm.busqueda;

import com.unmsm.busqueda.evaluacion.CostoEntreEstados;
import com.unmsm.busqueda.evaluacion.CostoPorDefecto;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Clase que busca segun una estrategia de busqueda
 * escogida definiendo la estructura del algoritmo
 * de una busqueda en un arbol.
 *
 * @author Arthur Mauricio Delgadillo
 * @see EstrategiaBusqueda
 * 
 */
public class ArbolBusqueda implements Busqueda {
    private int conteoBusqueda;
    private CostoEntreEstados calculaCosto;
    private EstrategiaBusqueda estrategiaBusqueda;
    private Queue<NodoDeBusqueda> colaDecolados;    
    
    public ArbolBusqueda(EstrategiaBusqueda estrategiaBusqueda){
        this.estrategiaBusqueda = estrategiaBusqueda;
    }
    
    public void cambiarEstrategiaBusqueda(EstrategiaBusqueda estrategiaBusqueda){
        this.estrategiaBusqueda = estrategiaBusqueda;
    }
    
    public ArbolBusqueda conCostoEntreEstados(CostoEntreEstados calculaCosto) {
        this.calculaCosto = calculaCosto;
        return this;
    }
    
    public Queue<NodoDeBusqueda> obtenerColaDecolados(){
        return colaDecolados;
    }
    
    @Override
    public Camino buscar(Estado estadoInicial) {
        inicializar(estadoInicial);

        while (estrategiaBusqueda.existeCandidato()) {
            NodoDeBusqueda candidato = estrategiaBusqueda.escogerCandidato();
            colaDecolados.add(candidato);

            if (!esMeta(candidato)) {
                expandirArbol(candidato);
                conteoBusqueda++;
            } else {
                return obtenerCaminoASolucion(candidato);
            }
        }

        return Camino.obtenerCaminoVacio();
    }
    
    @Override
    public int getConteoBusqueda() {
        return conteoBusqueda;
    }
    
    private void inicializar(Estado estadoInicial) {
        conteoBusqueda = 1;
        colaDecolados = new LinkedList();
        estrategiaBusqueda.inicializar();
        estrategiaBusqueda.agregarCandidato(obtenerRaiz(estadoInicial));
        inicializarCostoEntreEstados();
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

    private void expandirArbol(NodoDeBusqueda nodoEnExpansion) {
        List<Estado> sucesores = estrategiaBusqueda.expandirSucesores(nodoEnExpansion);
        estrategiaBusqueda.agregarNodos(nodoEnExpansion, sucesores);
    }
    
    private Camino obtenerCaminoASolucion(NodoDeBusqueda nodoTemp) {
        Camino caminoSolucion = new Camino();
        do {
            caminoSolucion.add(nodoTemp);
            nodoTemp = nodoTemp.getPadre();
        } while (nodoTemp != null);
        return caminoSolucion;
    }
}
