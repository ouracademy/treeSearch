package com.unmsm.ochotorres;

import com.unmsm.busqueda.Estado;
import java.util.List;

public class EstadoOchoPiezas implements Estado {

    private Tablero tablero;
    public static Tablero meta;

    public EstadoOchoPiezas(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public boolean esMeta() {
        //que el tablero contenga 8 torres sin hacerse dano
        //que esten 8 colocados 
        return this.tablero.cantidadPiezas==8;
    }

    @Override
    public List<Estado> generarSucesores() {
       
        
        
        return null;
    }

    @Override
    public boolean igual(Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
