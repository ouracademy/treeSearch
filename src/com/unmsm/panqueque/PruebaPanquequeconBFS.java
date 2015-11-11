package com.unmsm.panqueque;

import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.busquedas.noinformada.BusquedaBFS;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.busquedas.prioridad.Prioridad;
import com.unmsm.util.Consola;

public class PruebaPanquequeconBFS {

    public static void main(String[] args) {
        //Integer[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        Integer[] a = {4, 2, 3, 1};
        Busqueda busqueda = new BusquedaBFS();
        
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}