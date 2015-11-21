package com.unmsm.ochotorres;

import com.unmsm.ochotorres.Tablero.Celda;

public interface Pieza {

    public abstract void bloquear(Tablero tablero, Celda celda);
}
