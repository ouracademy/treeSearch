/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panqueque;

import com.unmsm.busqueda.heuristicas.Heuristica;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class HeuristicaPanquequesDebajoMayor implements Heuristica<EstadoPanqueques> {

    @Override
    public double calcular(EstadoPanqueques estado) {
        Integer[] panqueques = estado.getEstadoActual();
        double heuristica;

        if (panqueques[0] == 4) {
            heuristica = 3;
        } else if (panqueques[1] == 4) {
            heuristica = 2;
        } else if (panqueques[2] == 4) {
            heuristica = 1;
        } else {
            heuristica = 0;
        }
        return heuristica;
    }

}
