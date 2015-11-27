package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;
import java.io.Serializable;

public class Alfil implements Pieza, Serializable {

    @Override
    public void bloquear(Tablero tablero, Celda celda) {
        bloquearDiagonal(tablero, celda);

    }

 

    @Override
    public String toString() {
        return "alfil";
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
