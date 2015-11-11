/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.busquedas.prioridad;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PrioridadIzquierdaDerecha implements Prioridad{

    @Override
    public List<Estado> expandirSucesores(NodoDeBusqueda nodoEnExpansion) {
        List<Estado> sucesores = new ArrayList<>(nodoEnExpansion.expandir());
        Collections.reverse(sucesores);
        return sucesores;
    }
    
}
