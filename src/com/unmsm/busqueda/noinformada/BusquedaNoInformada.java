package com.unmsm.busqueda.noinformada;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import com.unmsm.busqueda.EstrategiaBusqueda;
import java.util.List;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public abstract class BusquedaNoInformada extends EstrategiaBusqueda {    
    @Override
    public void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores) {
        for (Estado sucesor : sucesores) {
            NodoDeBusqueda nuevoNodo = obtenerNodo(nodoEnExpansion, sucesor);
            if (!esRepetido(nuevoNodo)) {
                agregarCandidato(nuevoNodo);
            }
        }
    }
    
    @Override
    protected NodoDeBusqueda obtenerNodo(NodoDeBusqueda nodoPadre, Estado estado) {
        //Un nodo de busqueda simple sin funciones de evaluacion
        return new NodoDeBusqueda(nodoPadre, estado);
    }
}
