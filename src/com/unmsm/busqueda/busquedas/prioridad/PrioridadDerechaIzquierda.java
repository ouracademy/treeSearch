/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.busquedas.prioridad;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.List;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PrioridadDerechaIzquierda implements Prioridad{

    @Override
    public List<Estado> expandirSucesores(NodoDeBusqueda nodoDeBusqueda) {
        return nodoDeBusqueda.expandir();
    }
    
}