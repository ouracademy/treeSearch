package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.EstrategiaBusqueda;
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
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor());
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda)
                    .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
                
                
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 11);
        assertEquals(busqueda.getConteoBusqueda(), 18);
    }
    
    @Test
    public void OtraPruebaAEstrellaValida() {
        Integer[] a = { 4,1,3,2};
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor());
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda)
                    .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
                
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 9);
        assertEquals(busqueda.getConteoBusqueda(), 11);
    }
    
}
