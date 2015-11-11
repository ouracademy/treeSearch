package com.unmsm.busqueda.util;

import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.List;

/**
 * Una clase utilitaria que sirve como plantilla para crear otros tipos de
 * busqueda de arboles ver Template Method en GOF patterns
 *
 * @author Arthur Mauricio Delgadillo
 */
public abstract class ArbolBusquedaPlantilla implements Busqueda {
    private int conteoBusqueda;

    @Override
    public Camino buscar(Estado estadoInicial) {
        ArbolBusquedaPlantilla.this.inicializar(estadoInicial);

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
        inicializarEstrategiaBusqueda();
        NodoDeBusqueda raiz = new NodoDeBusqueda(estadoInicial);
        agregarCandidato(raiz);
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
        List<Estado> sucesores = nodoEnExpansion.expandir();
        agregarNodos(nodoEnExpansion, sucesores);
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
    
    public abstract void inicializarEstrategiaBusqueda();

    public abstract boolean existeCandidato();

    public abstract NodoDeBusqueda escogerCandidato();

    public abstract void agregarCandidato(NodoDeBusqueda candidato);

    public abstract void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores);
}
