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
        return "torre";
    }

    private void bloquearDiagonal(Tablero tablero, Celda celda) {
        int aros = mayor(Tablero.DIMENSION - celda.posicionY, celda.posicionY);

        for (int i = 0; i < aros; i++) {
            Punto punto = new Punto(celda.posicionX - i,celda.posicionY - i);
            tablero.getCelda(celda.posicionX - i, celda.posicionY - i).restringir();
            
            tablero.getCelda(celda.posicionX - i, celda.posicionY + i).restringir();
            tablero.getCelda(celda.posicionX + i, celda.posicionY - i).restringir();
            tablero.getCelda(celda.posicionX + i, celda.posicionY + i).restringir();

        }

    }

    private int mayor(int numero1, int numero2) {
        return Math.max(numero1, numero2);

    }

   

    public class Punto {

        int x;

        int y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;

        }

    }
}
