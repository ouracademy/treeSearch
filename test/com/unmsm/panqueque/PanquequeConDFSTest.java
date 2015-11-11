package com.unmsm.panqueque;

import com.unmsm.puzzle.*;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.busquedas.noinformada.BusquedaDFS;
import com.unmsm.busqueda.busquedas.prioridad.Prioridad;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConDFSTest {
    @Test
    public void DFSValido() {
        Integer[] a = { 4,1,3,2};
        Busqueda busqueda = new BusquedaDFS().conPrioridad(Prioridad.Tipos.IZQUIERDA_A_DERECHA);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 20);
        assertEquals(busqueda.getConteoBusqueda(), 21);
    }
}
