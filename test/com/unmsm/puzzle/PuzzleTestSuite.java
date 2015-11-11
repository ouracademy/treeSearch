/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.puzzle;

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
@Suite.SuiteClasses({com.unmsm.puzzle.Puzzle8ConBFSTest.class, com.unmsm.puzzle.Puzzle8ConAEstrellaTest.class, com.unmsm.puzzle.Puzzle8ConDFSTest.class, com.unmsm.puzzle.EstadoPuzleOchoTest.class})
public class PuzzleTestSuite {

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
