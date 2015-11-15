package com.unmsm.panqueque;

import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.noinformada.BusquedaDFS;
import com.unmsm.busqueda.prioridad.Prioridad;
import com.unmsm.util.Consola;

public class PruebaPanquequeconDFS {

    public static void main(String[] args) {
        Integer[] a = { 4,1,3,2};
        Busqueda busqueda = new BusquedaDFS().conPrioridad(Prioridad.Tipos.DERECHA_A_IZQUIERDA);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        
        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
