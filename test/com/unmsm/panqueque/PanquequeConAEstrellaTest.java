package com.unmsm.panqueque;

import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.informada.aestrella.BusquedaAEstrella;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConAEstrellaTest {
    @Test
    public void AEstrellaValido() {
        Integer[] a = { 4,2,3,1};
        Busqueda busqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor())
                .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 11);
        assertEquals(busqueda.getConteoBusqueda(), 18);
    }
    
    @Test
    public void OtraPruebaAEstrellaValida() {
        Integer[] a = { 4,1,3,2};
        Busqueda busqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor())
                .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 9);
        assertEquals(busqueda.getConteoBusqueda(), 11);
    }
    
}
