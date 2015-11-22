package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.informada.costouniforme.BusquedaCostoUniforme;
import com.unmsm.util.Consola;

public class PruebaPanquequeconCostoUniforme {

    public static void main(String[] args) {
        Integer[] a = { 4,2,3,1};
        ArbolBusqueda busqueda = new ArbolBusqueda(new BusquedaCostoUniforme())
                    .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(busqueda.obtenerColaDecolados());
        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
