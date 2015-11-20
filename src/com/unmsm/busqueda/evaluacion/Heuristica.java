package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;

/**
 * Define la interfaz para el calculo de la
 * heuristica segun el estado de un objeto
 * @author Arthur Mauricio Delgadillo
 * @param <T extends Estado>
 */
public interface Heuristica <T extends Estado>{
    public double calcular(T estado);
}