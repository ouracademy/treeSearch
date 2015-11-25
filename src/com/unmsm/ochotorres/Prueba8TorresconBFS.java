package com.unmsm.ochotorres;

import com.unmsm.puzzle.*;
import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.util.Consola;

public class Prueba8TorresconBFS {

    public static void main(String[] args) throws FueraLimiteException {
        
        int posicionX = 1;
        int posicionY = 2;
        Pieza pieza = new Torre();
        Tablero instance = new Tablero();
        instance.agregarPieza(posicionX, posicionY, pieza);
        Busqueda busqueda = new ArbolBusqueda(new BusquedaBFS());
        Camino caminoSolucion = busqueda.buscar(new EstadoOchoPiezas(instance));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
