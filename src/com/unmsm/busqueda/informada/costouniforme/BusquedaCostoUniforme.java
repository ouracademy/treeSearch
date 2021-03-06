package com.unmsm.busqueda.informada.costouniforme;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import com.unmsm.busqueda.util.ListaOrdenadaSE;
import com.unmsm.busqueda.EstrategiaBusqueda;
import java.util.List;

public class BusquedaCostoUniforme extends EstrategiaBusqueda{

    private ListaOrdenadaSE<NodoDeBusqueda> listaOrdenada;
    
    @Override
    public void inicializarCandidatos() {
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
