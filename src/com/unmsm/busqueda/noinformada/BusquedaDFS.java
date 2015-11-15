package com.unmsm.busqueda.noinformada;

import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.Stack;

/**
 * Define una búsqueda BFS
 * Usando una pila para los candidatos a buscar
 * @author Arthur Mauricio Delgadillo
 */
public class BusquedaDFS extends BusquedaNoInformada{
    private Stack<NodoDeBusqueda> pila;
    
    @Override
    public void inicializarEstrategiaBusqueda() {
        pila = new Stack();
    }

    @Override
    public boolean existeCandidato() {
        return !pila.isEmpty();
    }

    @Override
    public NodoDeBusqueda escogerCandidato() {
        return pila.pop();
    }

    @Override
    public void agregarCandidato(NodoDeBusqueda nuevoNodo) {
        pila.add(nuevoNodo);
    }
}
