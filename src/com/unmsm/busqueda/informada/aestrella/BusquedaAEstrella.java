package com.unmsm.busqueda.informada.aestrella;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import com.unmsm.busqueda.util.ListaOrdenadaSE;
import com.unmsm.busqueda.evaluacion.Heuristica;
import com.unmsm.busqueda.ArbolBusqueda;
import java.util.List;

/**
 * Clase que realiza busqueda A* segun una heuristica ver Strategy pattern en
 * GOF patterns
 *
 * @author Arthur Mauricio Delgadillo
 */
public class BusquedaAEstrella extends ArbolBusqueda{

    private ListaOrdenadaSE<NodoDeBusqueda> listaOrdenada;
    private final Heuristica heuristica;

    public BusquedaAEstrella(Heuristica heuristica) {
        this.heuristica = heuristica;
    }
    
    @Override
    public void inicializarEstrategiaBusqueda() {
        listaOrdenada = new ListaOrdenadaSE();
    }

    @Override
    public boolean existeCandidato() {
        return !listaOrdenada.estaVacia();
    }

    @Override
    public NodoDeBusqueda escogerCandidato() {
        return listaOrdenada.eliminarAlInicio();
    }

    @Override
    public void agregarCandidato(NodoDeBusqueda nodoEnExpansion) {
        listaOrdenada.insertar(nodoEnExpansion);
    }
    
    @Override
    protected NodoDeBusqueda obtenerNodo(NodoDeBusqueda nodoPadre, Estado estado) {
        //Un nodo de busqueda con heuristica
        return new NodoDeBusquedaAEstrella(nodoPadre, estado, obtenerHeuristica(estado));
    }
    
    @Override
    public void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores) {
        for (Estado sucesor : sucesores) {
            NodoDeBusqueda nuevoNodo = obtenerNodo(nodoEnExpansion, sucesor);
            if (!esRepetido(nuevoNodo)) {
                agregarCandidato(nuevoNodo);
            }
        }
    }
    
    private double obtenerHeuristica(Estado estado) {
        return heuristica.calcular(estado);
    }    
}
