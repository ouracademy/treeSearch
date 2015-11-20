package com.unmsm.panqueque;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.EstrategiaBusqueda;
import com.unmsm.busqueda.noinformada.BusquedaDFSLimitada;
import com.unmsm.busqueda.prioridad.Prioridad;
import com.unmsm.util.Consola;

public class PruebaPanquequeconDFSLimitado {

    public static void main(String[] args) {
        Integer[] a = { 4,1,3,2};
        int limite = 3;
        EstrategiaBusqueda estrategiaBusqueda = new BusquedaDFSLimitada(limite)
                .conPrioridad(Prioridad.Tipos.DERECHA_A_IZQUIERDA);
        Busqueda busqueda = new ArbolBusqueda(estrategiaBusqueda);
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));

        Consola.mostrar(caminoSolucion);
        System.out.println("Número de nodos examinados: "
                    + busqueda.getConteoBusqueda());
    }
}
