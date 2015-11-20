package com.unmsm.busqueda;

import com.unmsm.busqueda.prioridad.Prioridad;
import com.unmsm.busqueda.prioridad.PrioridadDerechaIzquierda;
import com.unmsm.busqueda.prioridad.PrioridadIzquierdaDerecha;
import java.util.List;

/**
 * Una clase que sirve como plantilla para crear otros tipos de
 * busqueda de arboles ver Template Method en GOF patterns
 *
 * @author Arthur Mauricio Delgadillo
 */
public abstract class EstrategiaBusqueda {
    
    public static final Prioridad PRIORIDAD_POR_DEFECTO = new PrioridadIzquierdaDerecha();
    private Prioridad prioridad;
    
    public EstrategiaBusqueda conPrioridad(Prioridad.Tipos tipoPrioridad) {
        if(Prioridad.Tipos.IZQUIERDA_A_DERECHA == tipoPrioridad){
            prioridad = new PrioridadIzquierdaDerecha();
        }else if(Prioridad.Tipos.DERECHA_A_IZQUIERDA == tipoPrioridad){
            prioridad = new PrioridadDerechaIzquierda();
        }
        return this;
    }
    
    public EstrategiaBusqueda conPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
        return this;
    }
    
    /*
     * Método de ayuda para revisar si un NodoDeBusqueda ya fue evaluado.
     * Devuelve true si es así, false en caso contrario.
     */
    protected boolean esRepetido(NodoDeBusqueda n) {
        boolean repetido = false;
        NodoDeBusqueda nodoARevisar = n;

        // Mientras el padre de n no sea null, revisar si este es igual
        // al nodo que estamos buscando.
        while (n.getPadre() != null && !repetido) {
            if (n.getPadre().getEstadoActual().igual(nodoARevisar.getEstadoActual())) {
                repetido = true;
            }
            n = n.getPadre();
        }

        return repetido;
    }
    
    public void inicializar(){
        inicializarPrioridad();
        inicializarCandidatos();
    }

    private void inicializarPrioridad() {
        if (prioridad == null) {
            prioridad = PRIORIDAD_POR_DEFECTO;
        }
    }
    
    List<Estado> expandirSucesores(NodoDeBusqueda nodoEnExpansion) {
        return prioridad.expandirSucesores(nodoEnExpansion);
    }
    
    public abstract void inicializarCandidatos();
    
    public abstract boolean existeCandidato();

    public abstract NodoDeBusqueda escogerCandidato();

    public abstract void agregarCandidato(NodoDeBusqueda candidato);

    public abstract void agregarNodos(NodoDeBusqueda nodoEnExpansion, List<Estado> sucesores);
    
    protected abstract NodoDeBusqueda obtenerNodo(NodoDeBusqueda nodoPadre, Estado estado);

    
}
