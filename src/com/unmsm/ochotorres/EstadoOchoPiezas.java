package com.unmsm.ochotorres;

import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstadoOchoPiezas implements Estado {
    private Tablero tablero;

    public EstadoOchoPiezas(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public boolean esMeta() {
        boolean esMeta=false;
        try {
             esMeta= tablero.getCantidadPiezas() == 8 && tablero.celdasLibres().isEmpty();
        } catch (FueraLimiteException ex) {
            Logger.getLogger(EstadoOchoPiezas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return esMeta;
    }

    @Override
    public List<Estado> generarSucesores() {
        List<Estado> sucesores = new ArrayList<>();
        
        try {
            //TODO aun no se ha probado...ver EstadoOchoPiezasTest.testGenerarSucesores
            //Se debe hacer una prueba
            for(Tablero.Celda celda: tablero.celdasLibres()){
                System.out.println(celda);
                Tablero tableroCopy = new Tablero(tablero);
                Pieza pieza = new Torre();
                try {
                    tableroCopy.agregarPieza(celda.posicionX, celda.posicionY, pieza);
                } catch (FueraLimiteException ex) {
                    Logger.getLogger(EstadoOchoPiezas.class.getName()).log(Level.SEVERE, null, ex);
                }
                pieza.bloquear(tableroCopy, celda);
                System.out.println(tableroCopy);
                sucesores.add(new EstadoOchoPiezas(tableroCopy));
            }
        } catch (FueraLimiteException ex) {
            Logger.getLogger(EstadoOchoPiezas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sucesores;
    }

    @Override
    public boolean igual(Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return tablero.toString();
    }
    
    

}
