/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.busqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class Camino implements Iterable<NodoDeBusqueda>{
    private final List<NodoDeBusqueda> camino;
    
    public Camino() {
        camino = new ArrayList<>();
    }
    
    public static Camino obtenerCaminoVacio(){
        return new Camino();
    }
    
    public void add(NodoDeBusqueda nodoTemp) {
        camino.add(nodoTemp);
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
       return voltear().iterator();
    }

    private List voltear() {
        List caminoEnReversa = new ArrayList(camino);
        Collections.reverse(caminoEnReversa);
        return caminoEnReversa;
    }
}
