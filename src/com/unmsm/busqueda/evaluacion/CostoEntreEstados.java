package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;

/**
 * Define la interfaz para el calculo de costos
 * de camino entre estados
 * @author Arthur Mauricio Delgadillo
 * @param <T>
 */
public interface CostoEntreEstados <T extends Estado>{
    public double calcular(T estado, T estadoSiguiente);
}
