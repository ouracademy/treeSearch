package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.util.Consola;

public class PruebaPanquequeconBFS {

    public static void main(String[] args) {
        Integer[] a = { 4,1,3,2};
        Busqueda busqueda = new ArbolBusqueda(new BusquedaBFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
