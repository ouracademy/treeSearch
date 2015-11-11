/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;

/**
 *
 * @author Arthur Mauricio Delgadillo
 * @param <T>
 */
public interface CostoEntreEstados <T extends Estado>{
    public double calcular(T estado, T estadoSiguiente);
}
