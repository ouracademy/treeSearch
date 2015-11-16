package com.unmsm.busqueda.informada.golosa;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class NodoDeBusquedaGolosa extends NodoDeBusqueda{
    final private double costoH;

    public NodoDeBusquedaGolosa(Estado estado) {
        super(estado);
        this.costoH = 0;
    }
    
    public NodoDeBusquedaGolosa(NodoDeBusqueda padre, Estado estado, double costoH) {
        super(padre, estado);
        this.costoH = costoH;
    }

    public double getCostoH() {
        return costoH;
    }
    
    @Override
    public int compareTo(NodoDeBusqueda otro) {
        NodoDeBusquedaGolosa otroEstrella = (NodoDeBusquedaGolosa)otro;
        if (this.getCostoH() > otroEstrella.getCostoH()) {
            return 1;
        } else if (this.getCostoH() < otroEstrella.getCostoH()) {
            return -1;
        } else {
            return 0;
        }
    }
}
