package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.EstrategiaBusqueda;
import com.unmsm.busqueda.noinformada.BusquedaDFS;
import com.unmsm.busqueda.prioridad.Prioridad;
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
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaDFS()
                .conPrioridad(Prioridad.Tipos.DERECHA_A_IZQUIERDA);
        
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 20);
        assertEquals(busqueda.getConteoBusqueda(), 21);
    }
    
    @Test
    public void unDobleDFS(){
        Integer[] a = { 4,1,3,2};
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaDFS()
                .conPrioridad(Prioridad.Tipos.DERECHA_A_IZQUIERDA);
        
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda);
        Camino caminoSolucion1 = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion1.getCosto(), 20);
        assertEquals(busqueda.getConteoBusqueda(), 21);
        
        Camino caminoSolucion2 = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion2.getCosto(), 20);
        assertEquals(busqueda.getConteoBusqueda(), 21);
    }
}
