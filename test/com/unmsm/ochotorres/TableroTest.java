/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TableroTest {

    public TableroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

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
     * Test of agregarPieza method, of class Tablero.
     */
    @Test(expected = FueraLimiteException.class)
    public void testAgregarPiezaFueraRango() throws FueraLimiteException {
        System.out.println("agregarPieza");
        int posicionX = -1;
        int posicionY = 100;
        Pieza pieza = new Torre();
        Tablero instance = new Tablero();
        instance.agregarPieza(posicionX, posicionY, pieza);
        
    }

    /**
     * Test of getCelda method, of class Tablero.
     */
    @Test
    public void testGetCelda() {
        System.out.println("getCelda");
        int posicionX = 1;
        int posicionY = 2;
        Tablero instance = new Tablero();
        Tablero.Celda result = instance.getCelda(posicionX, posicionY);
        assertNotNull(result);
    }

}
