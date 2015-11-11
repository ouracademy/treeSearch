package com.unmsm.busqueda;

import com.unmsm.busqueda.evaluacion.CostoEntreEstados;
import java.util.List;

/**
 *
 * Clase para representar un NodoDeBusqueda. Esta será una envoltura para un
 * Estado, y rastreara el costo para encontra ese estado y el nodo padre.
 */
public class NodoDeBusqueda implements Comparable<NodoDeBusqueda>{
    public static CostoEntreEstados costoEntreEstados;
    private Estado estadoActual;
    private NodoDeBusqueda padre;
    private double costo;
    private double costoH;
    private double costoEvaluacion;
    

    /**
     * Constructor para la raíz NodoDeBusqueda
     *
     * @param estado
     */
    public NodoDeBusqueda(Estado estado) {
        estadoActual = estado;
        padre = null;
        this.costo = this.costoEvaluacion = this.costoH = 0;
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
        this.costo = calculaCosto(padre,estado);
        this.costoH = 0;
        this.costoEvaluacion = 0;
    }
    
    /**
     * Constructor para todos los otros NodoDeBusqueda
     *
     * @param padre el nodo padre
     * @param estado el estado
     * @param costoH
     */
    public NodoDeBusqueda(NodoDeBusqueda padre, Estado estado, double costoH) {
        this.padre = padre;
        this.estadoActual = estado;
        this.costo = calculaCosto(padre, estado);
        this.costoH = costoH;
        this.costoEvaluacion = costo + costoH;
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

    public double getCostoF() {
        return costoEvaluacion;
    }

    public double getCostoH() {
        return costoH;
    }

    public double getCosto() {
        return costo;
    }
    
    public List<Estado> expandir() {
        return this.getEstadoActual().generarSucesores();
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

    private double calculaCosto(NodoDeBusqueda padre, Estado estado) {
        return padre.getCosto() + costoEntreEstados.calcular(estado, padre.getEstadoActual());
    }
}
