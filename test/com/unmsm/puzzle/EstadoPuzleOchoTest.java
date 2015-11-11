/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.puzzle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class EstadoPuzleOchoTest {
    private EstadoPuzzleOcho estadoPuzzle;
    
    
    public EstadoPuzleOchoTest() {
        int[] tablero = {1,2,3,4,5,6,0,7,8};
        estadoPuzzle = new EstadoPuzzleOcho(tablero);
        
    }

    /**
     * Test of getPiezasFueraDeLugar method, of class EstadoPuzleOcho.
     */
    @Test
    public void testGetPiezasFueraDeLugar() {
        System.out.println("getPiezasFueraDeLugar");
        int expResult = 3;
        int result = (int)new HeuristicaFueraLugar().calcular(estadoPuzzle);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistanciaManhattan method, of class EstadoPuzleOcho.
     */
    @Test
    public void testGetDistanciaManhattan() {
        System.out.println("getDistanciaManhattan");
        int expResult = 4;
        int result = (int)new HeuristicaManhattan().calcular(estadoPuzzle);
        assertEquals(expResult, result);
    }

    /**
     * Test of esMeta method, of class EstadoPuzleOcho.
     */
    @Test
    public void testEsMeta() {
        System.out.println("esMeta");
        boolean expResult = false;
        boolean result = estadoPuzzle.esMeta();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of igual method, of class EstadoPuzleOcho.
     */
    @Test
    public void testIgual() {
        System.out.println("igual");
        EstadoPuzzleOcho meta = new EstadoPuzzleOcho(estadoPuzzle.META);
        boolean expResult = false;
        boolean result = estadoPuzzle.igual(meta);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTableroActual method, of class EstadoPuzleOcho.
     */
    @Test
    public void testGetTableroActual() {
        System.out.println("getTableroActual");
        int[] expResult = {1,2,3,4,5,6,0,7,8};;
        int[] result = estadoPuzzle.getTableroActual();
        assertArrayEquals(expResult, result);
    }
    
}
