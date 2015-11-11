/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panqueque;

import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class EstadoPanquequeTest {
    private EstadoPanqueques instance;
    
    @Before
    public void setUp() {
        instance = new EstadoPanqueques(new Integer[]{4,2,3,1});
        EstadoPanqueques.META = new Integer[]{1,2,3,4};
    }
    
    /**
     * Test of esMeta method, of class EstadoPanqueques.
     */
    @Test
    public void testEsMeta() {
        System.out.println("esMeta");
        boolean expResult = false;
        boolean result = instance.esMeta();
        assertEquals(expResult, result);
    }

    /**
     * Test of generarSucesores method, of class EstadoPanqueques.
     */
    @Test
    public void testGenerarSucesores() {
        System.out.println("generarSucesores");
        List<Estado> expResult = getSucesores();
        List<Estado> result = instance.generarSucesores();
        assertEquals(expResult, result);
    }

    private List<Estado> getSucesores() {
        List<Estado> sucesores = new ArrayList<>();
        sucesores.add(new EstadoPanqueques(new Integer[]{1,3,2,4}));
        sucesores.add(new EstadoPanqueques(new Integer[]{3,2,4,1}));
        sucesores.add(new EstadoPanqueques(new Integer[]{2,4,3,1}));
        return sucesores;
    }
    
    /**
     * Test of igual method, of class EstadoPanqueques.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("igual");
        Estado estado = new EstadoPanqueques(new Integer[]{4,2,3,1});
        boolean expResult = true;
        boolean result = instance.igual(estado);
        assertEquals(expResult, result);
    }    
}
