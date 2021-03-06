package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.ochotorres.Alfil;
import com.unmsm.ochotorres.Reina;
import com.unmsm.ochotorres.Tablero;
import com.unmsm.ochotorres.Torre;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CeldaPresenter extends JButton implements ActionListener {

    private Tablero.Celda contenido;
    private TableroPresenter panelTablero;

    public CeldaPresenter(Posicion posicion, Tablero.Celda contenido) {
        setBounds(posicion.x, posicion.y, posicion.ancho, posicion.alto);
        this.contenido = contenido;
        this.establecerIcono();
        addActionListener(this);
    }

    public void setImagen(String imagePath) {
        IconUtil.ponerIcono(this, imagePath);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fila = contenido.posicionX;
        int columna = contenido.posicionY;
        contenido.obtenerTablero().agregarPieza(fila, columna, new Alfil());
        panelTablero.construirEnBaseA(contenido.obtenerTablero());
        
    }
    
    public void establecerContenido(Tablero.Celda celda) {
        this.contenido = celda;
    }

    private void establecerIcono() {
        switch (this.contenido.obtenerEstado()) {
            case LIBRE:
                if ((this.contenido.posicionX + this.contenido.posicionY) % 2 == 0) {
                    Color c=new Color(189,123,34,212);
                    setBackground(c);
                } else {
                    setBackground(new Color(243,248,155,208));
                }

                break;
            case OCUPADO:
                setImagen("/com/unmsm/ochotorres/interfazgrafica/imagenes/torre.png");
                break;
            case BLOQUEADO:
                setBackground(Color.BLACK);
                break;
        }
    }

    void establecerPanel(TableroPresenter panel) {
        panelTablero = panel;
    }
}
