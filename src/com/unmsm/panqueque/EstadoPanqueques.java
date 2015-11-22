package com.unmsm.panqueque;


import com.unmsm.busqueda.Estado;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class EstadoPanqueques implements Estado {

    private static final Integer[] META_DEFECTO = new Integer[]{1, 2, 3, 4};
    private Integer[] meta;
    private Integer[] estadoActual;
    
    public EstadoPanqueques() {
        this.estadoActual = new Integer[]{4, 2, 3, 1};
        this.meta = META_DEFECTO;
    }

    public EstadoPanqueques(Integer[] estadoActual) {
        this.estadoActual = estadoActual;
        this.meta = META_DEFECTO;
    }
    
    public void cambiarMeta(Integer[] meta){
    	this.meta = meta;
    }

    @Override
    public boolean esMeta() {
        return Arrays.equals(meta, estadoActual);
    }

    @Override
    public List<Estado> generarSucesores() {
        List<Estado> sucesores = new ArrayList<>();
        sucesores.add(voltearPanqueques(4));
        sucesores.add(voltearPanqueques(3));
        sucesores.add(voltearPanqueques(2));
        return sucesores;
    }

    private EstadoPanqueques voltearPanqueques(int numeroPanqueques) {
        Integer[] copia = Arrays.copyOf(estadoActual, estadoActual.length);
        copia = girar(copia, numeroPanqueques);
        return new EstadoPanqueques(copia);
    }
    
    private Integer[] girar(Integer[] obj, int numerosAGirar) {
        int i, j;
        for (i = numerosAGirar - 1, j = 0; i >= 0; i--, j++) {
            obj[i] = estadoActual[j];
        }
        return obj;
    }

    @Override
    public boolean igual(Estado estado) {
        return Arrays.equals(this.estadoActual, ((EstadoPanqueques)estado).estadoActual);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Arrays.deepHashCode(this.estadoActual);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EstadoPanqueques other = (EstadoPanqueques) obj;
        return this.igual(other);
    }

    @Override
    public String toString() {
        return "EstadoPanqueque{" + "estadoActual=" + Arrays.toString(estadoActual) + '}';
    }

    public Integer[] getEstadoActual() {
        return estadoActual;
    }
}
