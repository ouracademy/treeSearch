package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;

/**
 * 
 * @author Arthur Mauricio Delgadillo
 * @param <T extends Estado>
 */
public interface Heuristica <T extends Estado>{
    public double calcular(T estado);
}