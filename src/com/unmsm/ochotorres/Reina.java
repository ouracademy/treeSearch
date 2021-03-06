package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;
import java.io.Serializable;

public class Reina implements Pieza, Serializable {

    @Override
    public void bloquear(Tablero tablero, Celda celda) {
        bloquearFila(tablero, celda.posicionX);
        bloquearColumna(tablero, celda.posicionY);
        bloquearDiagonal(tablero, celda);

    }

    private void bloquearFila(Tablero tablero, int fila) {
        for (int j = 1; j <= Tablero.DIMENSION; j++) {
            tablero.getCelda(fila, j).restringir();
        }
    }

    private void bloquearColumna(Tablero tablero, int columna) {
        for (int i = 1; i <= Tablero.DIMENSION; i++) {
            tablero.getCelda(i, columna).restringir();
        }
    }

    @Override
    public String toString() {
        return "reina";
    }

    private void bloquearDiagonal(Tablero tablero, Celda celda) {
        int aros = mayor(Tablero.DIMENSION - celda.posicionY, celda.posicionY);
        System.out.println("aros :" + aros);
        for (int i = 1; i <= aros; i++) {
            bloquearAro(tablero, celda.posicionX - i, celda.posicionY - i);
            bloquearAro(tablero, celda.posicionX - i, celda.posicionY + i);
            bloquearAro(tablero, celda.posicionX + i, celda.posicionY - i);
            bloquearAro(tablero, celda.posicionX + i, celda.posicionY + i);
        }

    }

    private void bloquearAro(Tablero tablero, int x, int y) {

        if ((x >= 1 && x <= Tablero.DIMENSION) && (y >= 1 && y <= Tablero.DIMENSION)) {
            System.out.println("x: " + x + " y:" + y);
            tablero.getCelda(x, y).restringir();
        }
    }

    private int mayor(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

}
