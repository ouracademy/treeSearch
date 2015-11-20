package com.unmsm.busqueda.noinformada;

import java.util.ArrayDeque;
import java.util.Deque;

import com.unmsm.busqueda.NodoDeBusqueda;


/**
 * Define una búsqueda BFS
 * Usando una pila para los candidatos a buscar
 * @author Arthur Mauricio Delgadillo
 */
public class BusquedaDFS extends BusquedaNoInformada{
    protected Deque<NodoDeBusqueda> pila;
    
    @Override
    public void inicializarCandidatos() {
        pila = new ArrayDeque<>();
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
        pila.addFirst(nuevoNodo);
    }
}
