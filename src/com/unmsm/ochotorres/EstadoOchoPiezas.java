package com.unmsm.ochotorres;

import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.List;

public class EstadoOchoPiezas implements Estado {

    private Pieza pieza;
    private Tablero tablero;
/*
    public EstadoOchoPiezas(Tablero tablero) {
        this.tablero = tablero;
        this.pieza = new Alfil();
    }*/
    //establecer pieza 
    public EstadoOchoPiezas(Tablero tablero, Pieza pieza) {
        this.tablero = tablero;
        this.pieza = pieza;
    }



    @Override
    public boolean esMeta() {
        return tablero.getCantidadPiezas() == Tablero.DIMENSION && tablero.celdasLibres().isEmpty();
    }

    @Override
    public List<Estado> generarSucesores() {
        //muchos sucesores : 25401600 posiblidades de localizar las torres   consume mucho memoria  

        List<Estado> sucesores = new ArrayList<>();         
        for (Tablero.Celda celda : tablero.celdasLibres()) { 
            Tablero tableroCopia = tablero.duplicar();
            tableroCopia.agregarPieza(celda.posicionX, celda.posicionY, pieza);
            sucesores.add(new EstadoOchoPiezas(tableroCopia,pieza));//aumenté parametro pieza
        }
        return sucesores;
        
        
        //opcion 1:escoger aleatorios de sucesores : escoger 2 de todo el conjunto
        //opcion 2: usar hilos creo 
        /*
        List<Estado> sucesoresAleatorios = new ArrayList<>();
        int cantidadAleatorios=4;
        for (int i=0;i<cantidadAleatorios;i++){
            int indice = Aleatorio.obtenerNumero(0, sucesores.size());
            sucesoresAleatorios.add(sucesores.get(indice));
            
        }
        return sucesoresAleatorios;*/
        
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
