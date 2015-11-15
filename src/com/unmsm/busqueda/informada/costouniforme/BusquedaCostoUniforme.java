package com.unmsm.busqueda.informada.costouniforme;

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
public class BusquedaCostoUniforme extends ArbolBusqueda{

    private ListaOrdenadaSE<NodoDeBusqueda> listaOrdenada;
    
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
        return new NodoDeBusqueda(nodoPadre, estado);
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
}
