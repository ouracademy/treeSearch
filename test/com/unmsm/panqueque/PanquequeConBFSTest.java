package com.unmsm.panqueque;

import com.unmsm.puzzle.*;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.busquedas.noinformada.BusquedaBFS;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConBFSTest {
    @Test
    public void BFSValido() {
        Integer[] a = { 4,1,3,2};
        Busqueda busqueda = new BusquedaBFS();
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 3);
        assertEquals(busqueda.getConteoBusqueda(), 14);
    }
}
