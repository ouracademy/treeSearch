/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.util;

import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Estado;
import com.unmsm.busqueda.NodoDeBusqueda;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class Consola {
	

    public static void mostrar(Camino caminoSolucion) {
        if (caminoSolucion.empty()) {
            System.out.println("!Error! No se encontró una solución!");
        } else {

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
