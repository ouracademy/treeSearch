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
        for(Tablero.Celda celda: tablero.celdasLibres()){
            Tablero tableroCopy = new Tablero(tablero);
            tableroCopy.agregarPieza(celda.posicionX, celda.posicionY, new Torre());
            sucesores.add(new EstadoOchoPiezas(tableroCopy));
        }
        
        return sucesores;
    }

    @Override
    public boolean igual(Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
