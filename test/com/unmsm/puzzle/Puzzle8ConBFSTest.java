package com.unmsm.puzzle;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class Puzzle8ConBFSTest {
    @Test
    public void BFSValido() {
        int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 8};
        Busqueda busqueda = new ArbolBusqueda(new BusquedaBFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        assertEquals((int)caminoSolucion.getCosto(), 2);
        assertEquals(busqueda.getConteoBusqueda(), 7);
    }
}
