package com.unmsm.panqueque;

import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.informada.aestrella.BusquedaAEstrella;
import com.unmsm.util.Consola;

public class PruebaPanquequeconAEstrella {

    public static void main(String[] args) {
        Integer[] a = { 4,2,3,1};
        Busqueda busqueda = new BusquedaAEstrella(new HeuristicaPanquequesDebajoMayor())
                .conCostoEntreEstados(new CostoCantidadPanquequesAGirar());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
