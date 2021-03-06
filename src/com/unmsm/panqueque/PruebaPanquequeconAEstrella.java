package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.EstrategiaBusqueda;
import com.unmsm.busqueda.informada.aestrella.BusquedaAEstrella;
import com.unmsm.util.Consola;

public class PruebaPanquequeconAEstrella {

    public static void main(String[] args) {
        Integer[] a = { 4,2,3,1};
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor());
        ArbolBusqueda busqueda = new ArbolBusqueda(estrategiaBusqueda)
                .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(busqueda.obtenerColaDecolados());
        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
