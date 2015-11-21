package com.unmsm.ochotorres;

import java.util.Arrays;

public class Tablero {

    public static final int DIMENSION_X = 8;
    public static final int DIMENSION_Y = 8;
    private final Celda[][] matriz;
    private int cantidadPiezas;

    public Tablero() {
        matriz = new Celda[DIMENSION_X][DIMENSION_Y];
        cantidadPiezas = 0;
        crearTablero();
    }

    private void crearTablero() {
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matriz[i][j] = new Celda(i + 1, j + 1);
            }
        }
    }

    public void agregarPieza(int posicionX, int posicionY, Pieza pieza) throws FueraLimiteException {
        try{
            intentarAgregarPieza(posicionX, posicionY, pieza);
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new FueraLimiteException(ex);
        }

    }
    
    private void intentarAgregarPieza(int posicionX, int posicionY, Pieza pieza){
        Celda celda = getCelda(posicionX, posicionY);
        if (celda.estaLibre()) {
            pieza.bloquear(this, celda);
            celda.colocarPieza(pieza);
            cantidadPiezas++;
        }
    }

    public Celda getCelda(int posicionX, int posicionY) {
        return matriz[posicionX - 1][posicionY - 1];
    }

    @Override
    public String toString() {
        String cadenaMatriz = "";
        for (int i = 0; i < DIMENSION_X; i++) {
            cadenaMatriz += Arrays.toString(matriz[i]) + '\n';
        }
        return cadenaMatriz;
    }

    public static class Celda {

        public int posicionX;
        public int posicionY;
        private Pieza pieza;
        private Estado estado;

        public enum Estado {
            OCUPADO,
            RESTRINGIDO,
            LIBRE
        }

        private Celda(int posicionX, int posicionY) {
            this.posicionX = posicionX;
            this.posicionY = posicionY;
            this.estado = Estado.LIBRE;
        }

        public void colocarPieza(Pieza pieza) {
            this.pieza = pieza;
            this.estado = Estado.OCUPADO;
        }

        public void restringir() {
            this.estado = Estado.RESTRINGIDO;
        }

        public boolean estaLibre() {
            return estado == Estado.LIBRE;
        }

        @Override
        public String toString() {
            return String.format("%s %d %s %d %s %11s", "(", posicionX, ",", posicionY, ")=", estado);

        }
    }

}
