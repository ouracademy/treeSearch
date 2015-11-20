package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.EstrategiaBusqueda;
import com.unmsm.busqueda.informada.golosa.BusquedaGolosa;
import com.unmsm.util.Consola;

public class PruebaPanquequeconGolosa {

    public static void main(String[] args) {
        Integer[] a = { 4,2,3,1};
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaGolosa(new HeuristicaPanquequesDebajoMayor());
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        
        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
