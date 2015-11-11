package com.unmsm.busqueda;

import java.util.List;

/**
 *
 * Clase para representar un NodoDeBusqueda. Esta será una envoltura para un
 * Estado, y rastreara el costo para encontra ese estado y el nodo padre.
 */
final public class NodoDeBusqueda implements Comparable<NodoDeBusqueda> {

    private Estado estadoActual;
    private NodoDeBusqueda padre;
    private double costo; // costo para llegar a este estado
    private double costoHeuristica; // costo heurístico
    private double costoF; // costo f(n)

    /**
     * Constructor para la raíz NodoDeBusqueda
     *
     * @param estado
     */
    public NodoDeBusqueda(Estado estado) {
        estadoActual = estado;
        padre = null;
        costo = 0;
        costoHeuristica = 0;
        costoF = 0;
    }

    /**
     * Constructor para todos los otros NodoDeBusqueda
     *
     * @param padre el nodo padre
     * @param estado el estado
     * @param costoH el costo h(n) para obtener este nodo
     */
    public NodoDeBusqueda(NodoDeBusqueda padre, Estado estado, double costoH) {
        this.padre = padre;
        this.estadoActual = estado;
        this.costo = padre.getCosto() + estado.determinarCosto();
        this.costoHeuristica = costoH;
        this.costoF = costo + costoHeuristica;
    }

    /**
     * Constructor para todos los otros NodoDeBusqueda
     *
     * @param padre el nodo padre
     * @param estado el estado
     * @param costoH el costo h(n) para obtener este nodo
     */
    public NodoDeBusqueda(NodoDeBusqueda padre, Estado estado) {
        this.padre = padre;
        this.estadoActual = estado;
        this.costo = padre.getCosto() + estado.determinarCosto();
        this.costoF = 0;
        this.costoHeuristica = 0;
    }

    /**
     * @return el estadoActual
     */
    public Estado getEstadoActual() {
        return estadoActual;
    }

    /**
     * @return el padre
     */
    public NodoDeBusqueda getPadre() {
        return padre;
    }

    /**
     * @return el costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     *
     * @return el costo heurístico
     */
    public double getCostoHeuristica() {
        return costoHeuristica;
    }

    /**
     *
     * @return el costo f(n) para A*
     */
    public double getCostoF() {
        return costoF;
    }

    @Override
    public int compareTo(NodoDeBusqueda other) {
        if (this.getCostoF() > other.getCostoF()) {
            return 1;
        } else if (this.getCostoF() < other.getCostoF()) {
            return -1;
        } else {
            return 0;
        }
    }

    public List<Estado> expandir() {
        return this.getEstadoActual().generarSucesores();
    }
}
