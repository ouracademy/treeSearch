package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Torre implements Pieza,Serializable {

    @Override
    public void bloquear(Tablero tablero, Celda celda) {
        try {
            bloquearFila(tablero,celda.posicionX);
        } catch (FueraLimiteException ex) {
            Logger.getLogger(Torre.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bloquearColumna(tablero,celda.posicionY);
        } catch (FueraLimiteException ex) {
            Logger.getLogger(Torre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void bloquearFila(Tablero tablero,int fila) throws FueraLimiteException {
        for (int j = 1; j <= Tablero.DIMENSION; j++) {
            tablero.getCelda(fila, j).restringir();
           
           
        }
    }

    private void bloquearColumna(Tablero tablero,int columna) throws FueraLimiteException {
        for (int i = 1; i <= Tablero.DIMENSION; i++) {
            tablero.getCelda(i, columna).restringir();
        }
    }

    @Override
    public String toString() {
        return "torre";
    }

}
