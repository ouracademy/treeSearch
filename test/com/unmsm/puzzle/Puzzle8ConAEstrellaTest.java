package com.unmsm.puzzle;

import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.busquedas.BusquedaAEstrella;
import com.unmsm.busqueda.heuristicas.Heuristica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class Puzzle8ConAEstrellaTest {
    
    @Test
    public void AEstrellaConHeuristicaManhattan() {
        int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 8};
        Heuristica heuristica = new HeuristicaManhattan();
        Busqueda busqueda = new BusquedaAEstrella(heuristica);
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 2);
        assertEquals(busqueda.getConteoBusqueda(), 3);
    }
    
    @Test
    public void AEstrellaConHeuristicaFueraLugar() {
        int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 8};
        Heuristica heuristica = new HeuristicaFueraLugar();
        Busqueda busqueda = new BusquedaAEstrella(heuristica);
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 2);
        assertEquals(busqueda.getConteoBusqueda(), 3);
    }
    
    @Test
    public void AEstrellaConHeuristicaManhattanOtraPrueba() {
        int[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        Heuristica heuristica = new HeuristicaManhattan();
        Busqueda busqueda = new BusquedaAEstrella(heuristica);
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 15);
        assertEquals(busqueda.getConteoBusqueda(), 243);
    }
    
    @Test
    public void AEstrellaConHeuristicaFueraLugarOtraPrueba() {
        int[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        Heuristica heuristica = new HeuristicaFueraLugar();
        Busqueda busqueda = new BusquedaAEstrella(heuristica);
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 15);
        assertEquals(busqueda.getConteoBusqueda(), 563);
    }
}
