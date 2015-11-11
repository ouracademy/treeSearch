/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;


/**
 * Una clase que por defecto define el costo entre un
 * estado a otro como 1
 * @author Arthur Mauricio Delgadillo
 */
public class CostoPorDefecto implements CostoEntreEstados<Estado>{

    @Override
    public double calcular(Estado estado, Estado estadoSiguiente) {
        return 1;
    }
    
}
