package com.unmsm.busqueda;

import java.util.List;

/**
 * 
 * Interfaz Estado desde el cual el estado del problema hereda. Define un método
 * para revisar si el estado actual es una meta, generar sucesores, y encontrar
 * el costo para llegar al estado actual.
 */
public interface Estado
{
	/**
         * Determina si el estado actual es una meta
         * @return esMeta
         */
        boolean esMeta();

	/**
         * Generar sucesores para el estado actual
         * @return lista de estados
         */
        List<Estado> generarSucesores();
        
        /**
         * Determinar el costo desde el estado inicial hasta ESTE estado
         * @return costo
         */
	double determinarCosto();

	/**
         * Comparar los datos del estado actual
         * @param estado
         * @return estado == this.estado
         */
	public boolean igual(Estado estado);
}
