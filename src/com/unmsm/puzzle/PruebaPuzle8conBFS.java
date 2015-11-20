package com.unmsm.puzzle;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.util.Consola;

public class PruebaPuzle8conBFS {

    public static void main(String[] args) {
        //int[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 8};
        Busqueda busqueda = new ArbolBusqueda(new BusquedaBFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
