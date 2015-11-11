package com.unmsm.puzzle;

import com.unmsm.busqueda.evaluacion.Heuristica;
import static com.unmsm.puzzle.EstadoPuzzleOcho.META;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class HeuristicaFueraLugar implements Heuristica<EstadoPuzzleOcho>{

    /**
     *
     * @param estadoPuzzleOcho
     * @return numero de objetos fuera de lugar
     */
    @Override
    public double calcular(EstadoPuzzleOcho estadoPuzzleOcho) {
        int fueraDeLugar = 0;
        int [] tableroActual = estadoPuzzleOcho.getTableroActual();
        
        for (int i = 0; i < tableroActual.length; i++) {
            if (tableroActual[i] != META[i]) {
                fueraDeLugar++;
            }
        }
        return fueraDeLugar;
    }
}
