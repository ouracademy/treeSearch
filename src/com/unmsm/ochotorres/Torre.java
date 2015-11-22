package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;

public class Torre implements Pieza {

    @Override
    public void bloquear(Tablero tablero, Celda celda) {
        bloquearFila(tablero,celda.posicionX);
        bloquearColumna(tablero,celda.posicionY);
    }

    private void bloquearFila(Tablero tablero,int fila) {
        for (int j = 1; j <= Tablero.DIMENSION; j++) {
            tablero.getCelda(fila, j).ocupar();
        }
    }

    private void bloquearColumna(Tablero tablero,int columna) {
        for (int i = 1; i <= Tablero.DIMENSION; i++) {
            tablero.getCelda(i, columna).ocupar();
        }
    }

    @Override
    public String toString() {
        return "torre";
    }

}
