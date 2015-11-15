/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.prioridad;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.List;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public interface Prioridad {
    List<Estado> expandirSucesores(NodoDeBusqueda nodoEnExpansion);
    
    enum Tipos{
        
        IZQUIERDA_A_DERECHA,
        DERECHA_A_IZQUIERDA
    }
    
}
