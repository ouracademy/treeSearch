/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.util;

import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;
import java.util.Queue;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class Consola {
	
    public static void mostrar(Queue<NodoDeBusqueda> cola){
        System.out.println("Nodos salidos de la cola:");
        for (NodoDeBusqueda nodo : cola) {
            mostrar(nodo.getEstadoActual());
        }
        System.out.println("-------------");
    }

    public static void mostrar(Camino caminoSolucion) {
        if (caminoSolucion.empty()) {
            System.out.println("!Error! No se encontró una solución!");
        } else {
            System.out.println("Camino a solucion:");
            mostrarEstados(caminoSolucion);
        }
    }

    private static void mostrarEstados(Camino caminoSolucion) {
        for (NodoDeBusqueda nodo : caminoSolucion) {
            mostrar(nodo.getEstadoActual());
        }

        System.out.println("El costo fue: " + caminoSolucion.getCosto());
    }
    
    private static void mostrar(Estado estado) {
        System.out.println(estado);
        System.out.println();
        System.out.println();
    }
}
