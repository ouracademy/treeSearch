package com.unmsm.busqueda.informada.aestrella;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class NodoDeBusquedaAEstrella extends NodoDeBusqueda{
    final private double costoH;
    final private double costoEvaluacion;    

    public NodoDeBusquedaAEstrella(Estado estado) {
        super(estado);
        this.costoEvaluacion = this.costoH = 0;
    }
    
    public NodoDeBusquedaAEstrella(NodoDeBusqueda padre, Estado estado, double costoH) {
        super(padre, estado);
        this.costoH = costoH;
        this.costoEvaluacion = costo + costoH;
    }
    
    public double getCostoF() {
        return costoEvaluacion;
    }

    public double getCostoH() {
        return costoH;
    }
    
    @Override
    public int compareTo(NodoDeBusqueda otro) {
        NodoDeBusquedaAEstrella otroEstrella = (NodoDeBusquedaAEstrella)otro;
        if (this.getCostoF() > otroEstrella.getCostoF()) {
            return 1;
        } else if (this.getCostoF() < otroEstrella.getCostoF()) {
            return -1;
        } else {
            return 0;
        }
    }
}
