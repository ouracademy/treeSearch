package com.unmsm.busqueda.informada.golosa;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import com.unmsm.busqueda.evaluacion.Heuristica;
import com.unmsm.busqueda.EstrategiaBusqueda;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BusquedaGolosa extends EstrategiaBusqueda {

    private Stack<NodoDeBusqueda> cola;
    private final Heuristica heuristica;

    public BusquedaGolosa(Heuristica heuristica) {
        this.heuristica = heuristica;
    }

    @Override
    public void inicializarCandidatos() {
        cola = new Stack<>();
    }

    @Override
    public boolean existeCandidato() {
        return !cola.isEmpty();
    }

    @Override
    public NodoDeBusqueda escogerCandidato() {
        return cola.pop();
    }

    @Override
    public void agregarCandidato(NodoDeBusqueda nodoEnExpansion) {
        cola.add(nodoEnExpansion);
    }

    @Override
    protected NodoDeBusqueda obtenerNodo(NodoDeBusqueda nodoPadre, Estado estado) {
        //Un nodo de busqueda con heuristica
        return new NodoDeBusquedaGolosa(nodoPadre, estado, obtenerHeuristica(estado));
    }

    private double obtenerHeuristica(Estado estado) {
        return heuristica.calcular(estado);
    }

    @Override
    public void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores) {
        List<NodoDeBusquedaGolosa> sucesoresList = new ArrayList<>();

        for (Estado sucesor : sucesores) {
            NodoDeBusqueda nuevoNodo = obtenerNodo(nodoEnExpansion, sucesor);

            if (!esRepetido(nuevoNodo)) {
                sucesoresList.add((NodoDeBusquedaGolosa) nuevoNodo);
            }
        }

        // Revisar si sucesores esta vacío, para continuar la iteración
        // arriba
        if (!sucesoresList.isEmpty()) {
            NodoDeBusquedaGolosa nodoMasBajo = sucesoresList.get(0);

            /*
             * Este bucle encuentra el f(n) más bajo en un nodo, y luego lo
             * establece como el nodo más bajo.
             */
            for (int i = 0; i < sucesoresList.size(); i++) {
                if (sucesoresList.get(i).getCostoH() < nodoMasBajo.getCostoH()) {
                    nodoMasBajo = sucesoresList.get(i);
                }
            }

            int valorMasBajo = (int) nodoMasBajo.getCostoH();

            // Agrega cualquier nodo que tenga el mismo valor más bajo.
            for (int i = 0; i < sucesoresList.size(); i++) {
                if (sucesoresList.get(i).getCostoH() == valorMasBajo) {
                    agregarCandidato(sucesoresList.get(i));
                }
            }
        }
    }
}
