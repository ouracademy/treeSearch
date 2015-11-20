package com.unmsm.puzzle;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.evaluacion.Heuristica;
import com.unmsm.busqueda.informada.aestrella.BusquedaAEstrella;
import com.unmsm.util.Consola;

public class PruebaPuzle8conAEstrella {

    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 4, 5, 6, 7, 0, 8};
        
        //int[] a = {1, 2, 3, 4, 5, 6, 0, 7, 8};
        Heuristica heuristica = new HeuristicaManhattan();
        Busqueda busqueda = new ArbolBusqueda(new BusquedaAEstrella(heuristica));
        Camino caminoSolucion = busqueda.buscar(new EstadoPuzzleOcho(a));
        //Busqueda busqueda = new BusquedaAEstrella(new HeuristicaFueraLugar());
        
        

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
