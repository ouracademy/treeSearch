package com.unmsm.busqueda;

/**
 * @author Arthur Mauricio Delgadillo
 */
public interface Busqueda {
    /**
     * Función de búsqueda
     *
     * @param estadoInicial
     * @return
     */
    public Camino buscar(Estado estadoInicial);

    /**
     * Funcion para obtener el numero de nodos analizados en una busqueda
     * @return 
     */
    public int getConteoBusqueda();
}
