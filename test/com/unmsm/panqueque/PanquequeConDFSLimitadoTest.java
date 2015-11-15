package com.unmsm.panqueque;

import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaDFS;
import com.unmsm.busqueda.noinformada.BusquedaDFSLimitada;
import com.unmsm.busqueda.prioridad.Prioridad;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConDFSLimitadoTest {
    @Test
    public void DFSLimitadoValido() {
        Integer[] a = { 4,1,3,2};
        int limite = 3;
        Busqueda busqueda = new BusquedaDFSLimitada(limite).conPrioridad(Prioridad.Tipos.DERECHA_A_IZQUIERDA);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 3);
        assertEquals(busqueda.getConteoBusqueda(), 8);
    }
}
