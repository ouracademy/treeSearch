package com.unmsm.busqueda.busquedas.noinformada;

import com.unmsm.busqueda.busquedas.noinformada.BusquedaNoInformada;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Define una búsqueda BFS en un puzle validado. Usando una cola para los
 * candidatos a buscar
 *
 * @author Arthur Mauricio Delgadillo
 */
final public class BusquedaBFS extends BusquedaNoInformada{

    protected Queue<NodoDeBusqueda> cola;

    @Override
    public void inicializarEstrategiaBusqueda() {
        cola = new LinkedList();
    }

    @Override
    public boolean existeCandidato() {
        return !cola.isEmpty();
    }

    @Override
    public NodoDeBusqueda escogerCandidato() {
        return cola.poll();
    }

    @Override
    public void agregarCandidato(NodoDeBusqueda candidato) {
        cola.add(candidato);
    }
}
