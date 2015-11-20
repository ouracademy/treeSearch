/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panqueque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PanquequeConDFSTest.class, PanquequeConAEstrellaTest.class, 
	PanquequeConCostoUniformeTest.class, EstadoPanquequeTest.class, 
	PanquequeConBFSTest.class, PanquequeConGolosaTest.class,
	PanquequeConDFSLimitadoTest.class})
public class PanquequeTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
