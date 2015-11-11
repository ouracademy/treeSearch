/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda.util;

import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.evaluacion.CostoPorDefecto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class CostoPorDefectoTest {

    /**
     * Test of calcular method, of class CostoPorDefecto.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Estado estado = null;
        Estado estadoSiguiente = null;
        CostoPorDefecto instance = new CostoPorDefecto();
        double expResult = 1.0;
        double result = instance.calcular(estado, estadoSiguiente);
        assertEquals(expResult, result, 0.0);
    }
    
}
