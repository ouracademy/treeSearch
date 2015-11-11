/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.puzzle;

import com.unmsm.busqueda.heuristicas.Heuristica;
import static com.unmsm.puzzle.EstadoPuzzleOcho.META;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class HeuristicaManhattan implements Heuristica<EstadoPuzzleOcho> {

    @Override
    public double calcular(EstadoPuzzleOcho estadoPuzzleOcho) {
        int distManhatan = 0;
        int [] tableroActual = estadoPuzzleOcho.getTableroActual();
        
        for (int i = 0; i < tableroActual.length; i++) {
            int value = tableroActual[i];
            int posicionMeta = calculaPosicion(value, META); // en array "e" i es la posicion incial de e[i]  y  la posicion meta es buscar la posicion de e[i] en meta
            int distanciaLineal = Math.abs(posicionMeta - i);
            int distanciaManhatan = calcularMovimientos(distanciaLineal);
            
            distManhatan += distanciaManhatan;
        }
        return distManhatan;
    }
    
    private int calculaPosicion(int valor, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (valor == array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    private int calcularMovimientos(int distanciaLineal) {
        int distanciaManhatan = 0;
        int numeroXFila = 3;
        int numeroXColumna = 3;
        int mov = distanciaLineal % numeroXColumna;
        int mov2 = (distanciaLineal - mov) / numeroXFila;
        distanciaManhatan = mov + mov2;
        return distanciaManhatan;
    }
    
}
