package com.unmsm.busqueda;

import com.unmsm.busqueda.evaluacion.CostoEntreEstados;
import java.util.List;

/**
 * Clase para representar un NodoDeBusqueda. Esta será una envoltura para un
 * Estado, y rastreara el costo para encontra ese estado y el nodo padre.
 */
public class NodoDeBusqueda implements Comparable<NodoDeBusqueda>{

    public static CostoEntreEstados costoEntreEstados;
    protected Estado estadoActual;
    protected NodoDeBusqueda padre;
    protected double costo;

    /**
     * Constructor para la raíz NodoDeBusqueda
     *
     * @param estado
     */
    public NodoDeBusqueda(Estado estado) {
        estadoActual = estado;
        padre = null;
        this.costo = 0;
    }

    /**
     * Constructor para todos los otros NodoDeBusqueda
     *
     * @param padre el nodo padre
     * @param estado el estado
     */
    public NodoDeBusqueda(NodoDeBusqueda padre, Estado estado) {
        this.padre = padre;
        this.estadoActual = estado;
        this.costo = calculaCosto(padre, estado);
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public NodoDeBusqueda getPadre() {
        return padre;
    }

    public double getCosto() {
        return costo;
    }

    public List<Estado> expandir() {
        return this.getEstadoActual().generarSucesores();
    }

    private double calculaCosto(NodoDeBusqueda padre, Estado estado) {
        return padre.getCosto() + costoEntreEstados.calcular(estado, padre.getEstadoActual());
    }

    @Override
    public int compareTo(NodoDeBusqueda otro) {
        if (this.getCosto() > otro.getCosto()) {
            return 1;
        } else if (this.getCosto() < otro.getCosto()) {
            return -1;
        } else {
            return 0;
        }
    }
}
