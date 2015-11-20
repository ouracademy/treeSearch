package com.unmsm.busqueda.noinformada;

import com.unmsm.busqueda.NodoDeBusqueda;

/**
 * Define una búsqueda BFS
 * Usando una pila para los candidatos a buscar
 * @author Arthur Mauricio Delgadillo
 */
public class BusquedaDFSLimitada extends BusquedaDFS{
    private final int limiteProfundidad;
    
    public BusquedaDFSLimitada(int limiteProfundidad) {
        this.limiteProfundidad = limiteProfundidad;
    }
    
    @Override
    public void agregarCandidato(NodoDeBusqueda nuevoNodo) {
        if(nuevoNodo.getProfundidad()  <= limiteProfundidad)
            pila.addFirst(nuevoNodo);
    }
}
