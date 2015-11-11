package com.unmsm.panqueque;

import com.unmsm.busqueda.evaluacion.CostoEntreEstados;


/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class CostoCantidadPanquequesAGirar implements CostoEntreEstados<EstadoPanqueques> {

    public CostoCantidadPanquequesAGirar() {
    }
    
    @Override
    public double calcular(EstadoPanqueques estado, EstadoPanqueques estadoSiguiente) {
        Integer [] panqueques = estado.getEstadoActual();
        Integer [] panquequesSiguiente = estadoSiguiente.getEstadoActual();
        
        double costoCambio = 0.0;
        for (int i = panqueques.length - 1; i >= 0; i--) {
            if (!panqueques[i].equals(panquequesSiguiente[i])) {
                costoCambio = i + 1;
                break;
            }
        }

        return costoCambio;
    }
}
