package com.unmsm.busqueda.evaluacion;

import com.unmsm.busqueda.Estado;

/**
 * Una clase que por defecto define el costo 
 * entre estados a 1
 * @see Special Case Pattern, Martin Fowler
 * @author Arthur Mauricio Delgadillo
 */
public class CostoPorDefecto implements CostoEntreEstados<Estado>{

    @Override
    public double calcular(Estado estado, Estado estadoSiguiente) {
        return 1;
    }
    
}
