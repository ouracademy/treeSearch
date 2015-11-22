package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;

public class Torre implements Pieza {

    @Override
    public void bloquear(Tablero tablero, Celda celda) {
        bloquearFila(tablero,celda.posicionX);
        bloquearColumna(tablero,celda.posicionY);
    }

    private void bloquearFila(Tablero tablero,int fila) {
        for (int j = 1; j <= Tablero.DIMENSION_Y; j++) {
            tablero.getCelda(fila, j).restringir();
        }
    }

    private void bloquearColumna(Tablero tablero,int columna) {
        for (int i = 1; i <= Tablero.DIMENSION_X; i++) {
            tablero.getCelda(i, columna).restringir();
        }
    }

    @Override
    public String toString() {
        return "torre";
    }

}
