/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TableroTest {

    /**
     * Test of agregarPieza method, of class Tablero.
     */
    @Test
    public void testAgregarPieza() throws FueraLimiteException {
        System.out.println("agregarPieza");
        int posicionX = 1;
        int posicionY = 2;
        Pieza pieza = new Torre();
        Tablero instance = new Tablero();
        instance.agregarPieza(posicionX, posicionY, pieza);
        assertFalse(instance.getCelda(posicionX, posicionY).estaLibre());
    }

    /**
     * Test of getCelda method, of class Tablero.
     */
    @Test
    public void testGetCelda() throws FueraLimiteException {
        System.out.println("getCelda");
        int posicionX = 1;
        int posicionY = 2;
        Tablero instance = new Tablero();
        Tablero.Celda result = instance.getCelda(posicionX, posicionY);
        assertNotNull(result);
    }
    
    /**
     * Test of getCelda method, of class Tablero.
     */
    @Test(expected = FueraLimiteException.class)
    public void testGetCeldaFueraRango() throws FueraLimiteException {
        System.out.println("getCeldaFueraRango");
         int posicionX = -1;
        int posicionY = 100;
        Tablero instance = new Tablero();
        instance.getCelda(posicionX, posicionY);
    }

}
