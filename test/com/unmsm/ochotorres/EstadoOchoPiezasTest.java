package com.unmsm.ochotorres;

import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.List;
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
public class EstadoOchoPiezasTest {
    
    public EstadoOchoPiezasTest() {
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
     * Test of esMeta method, of class EstadoOchoPiezas.
     */
    @Test
    public void testEsMeta() throws FueraLimiteException {
        System.out.println("esMeta");
        EstadoOchoPiezas instance = unaMeta();
        boolean result = instance.esMeta();
        assertTrue(result);
    }

    private EstadoOchoPiezas unaMeta() throws FueraLimiteException{
        Tablero tablero = unTableroConDiagonalDeTamaño(Tablero.DIMENSION, new Torre());
        return new EstadoOchoPiezas(tablero);
    }
    
    private Tablero unTableroConDiagonalDeTamaño(int tamaño, Pieza pieza) throws FueraLimiteException{
        Tablero tablero = new Tablero();
        for(int i=1;i<=tamaño;i++){
            Tablero.Celda celda = tablero.agregarPieza(i, i, pieza);
            pieza.bloquear(tablero, celda);
        }
        System.out.println(tablero);    
        return tablero;
    }
    
    /**
     * Test of generarSucesores method, of class EstadoOchoPiezas.
     */
    @Test
    public void testGenerarSucesores() throws FueraLimiteException {
        System.out.println("generarSucesores");
        Tablero tablero = unTableroConDiagonalDeTamaño(4, new Torre());
      //  EstadoOchoPiezas instance = new EstadoOchoPiezas(tablero);
        List<Estado> expResult = new ArrayList<>();
//
//        expResult.add(new EstadoOchoPiezas(new Tablero(tablero)));
//        expResult.add(instance);
//        expResult.add(instance);
//        expResult.add(instance);
        
        
       // List<Estado> result = instance.generarSucesores();
      //  System.out.println(result);
        //assertEquals(expResult, result);
    }

    /**
     * Test of igual method, of class EstadoOchoPiezas.
     */
    @Test
    public void testIgual() {
        System.out.println("igual");
        Estado estado = null;
        EstadoOchoPiezas instance = null;
        boolean expResult = false;
        boolean result = instance.igual(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
