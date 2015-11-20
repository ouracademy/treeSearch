package com.unmsm.puzzle;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaDFS;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class Puzzle8ConDFSTest {
    @Test
    @Ignore("Toma mucho tiempo")
    public void DFSValidoConTiempoLargo() {
        int[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        Busqueda busqueda = new ArbolBusqueda(new BusquedaDFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 42105);
        assertEquals(busqueda.getConteoBusqueda(), 43304);
    }
    
    @Test
    public void DFSValidoConTiempoCorto(){
        int[] a = {1,2,3,4,5,6,0,7,8};
        Busqueda busqueda = new ArbolBusqueda(new BusquedaDFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 2);
        assertEquals(busqueda.getConteoBusqueda(), 3);
    }
}
