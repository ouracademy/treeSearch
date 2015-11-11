/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class Camino implements Iterable<NodoDeBusqueda>{
    private final Stack<NodoDeBusqueda> camino;
    
    public Camino() {
        camino = new Stack<>();
    }
    
    public static Camino obtenerCaminoVacio(){
        return new Camino();
    }
    
    public void add(NodoDeBusqueda nodoTemp) {
        camino.push(nodoTemp);
    }

    public boolean empty() {
        return camino.isEmpty();
    }

    public double getCosto() {
        NodoDeBusqueda primerNodo = camino.get(0);
        return primerNodo.getCosto();
    }
    
    @Override
    public Iterator<NodoDeBusqueda> iterator() {
       return camino.iterator();
    }
}
