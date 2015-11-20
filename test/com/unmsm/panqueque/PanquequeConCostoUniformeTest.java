package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.informada.costouniforme.BusquedaCostoUniforme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConCostoUniformeTest {
    @Test
    public void AEstrellaValido() {
        Integer[] a = { 4,2,3,1};
                
        Busqueda busqueda = new ArbolBusqueda(new BusquedaCostoUniforme())
                    .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
                
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        assertEquals((int)caminoSolucion.getCosto(), 11);
        assertEquals(busqueda.getConteoBusqueda(), 25);
    }
}
