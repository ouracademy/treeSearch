package com.unmsm.ochotorres;

import com.unmsm.panqueque.*;
import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Estado;
import com.unmsm.util.Consola;

public class PruebaTorreconBFS {

    public static void main(String[] args) throws FueraLimiteException {
        
        
        Tablero tablero = new Tablero();
       // tablero.agregarPieza(1,2, new Torre());
       // tablero.agregarPieza(7,2, new Torre());
        System.out.println(tablero);
//        Estado estadoInicial = new EstadoOchoPiezas(tablero);
//        Busqueda busqueda = new ArbolBusqueda(new BusquedaBFS());
//        Camino caminoSolucion = busqueda.buscar(estadoInicial);
//
//        Consola.mostrar(caminoSolucion);
//        System.out.println("Número de nodos examinados: "
//                    + busqueda.getConteoBusqueda());
    }
}
