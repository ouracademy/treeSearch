package com.unmsm.ochotorres;

import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.List;

public class EstadoOchoPiezas implements Estado {

    private Tablero tablero;

    public EstadoOchoPiezas(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public boolean esMeta() {
        return tablero.getCantidadPiezas() == 8 && tablero.celdasLibres().isEmpty();
    }

    @Override
    public List<Estado> generarSucesores() {
        List<Estado> sucesores = new ArrayList<>();

        //TODO aun no se ha probado...ver EstadoOchoPiezasTest.testGenerarSucesores
        //Se debe hacer una prueba
        for (Tablero.Celda celda : tablero.celdasLibres()) {
            Tablero tableroCopy = new Tablero(tablero);
            Pieza pieza = new Torre();
            tableroCopy.agregarPieza(celda.posicionX, celda.posicionY, pieza);
            pieza.bloquear(tableroCopy, celda);
            System.out.println(celda);
            System.out.println(tableroCopy);
            sucesores.add(new EstadoOchoPiezas(tableroCopy));
        }

        return sucesores;
    }

    @Override
    public boolean igual(Estado estado) {
        return this.tablero.equals(((EstadoOchoPiezas) estado).getTablero());
    }

    @Override
    public String toString() {
        return tablero.toString();
    }

    public Tablero getTablero() {
        return this.tablero;
    }

}
