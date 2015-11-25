package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.busqueda.Estado;
import com.unmsm.ochotorres.FueraLimiteException;
import com.unmsm.ochotorres.Tablero;
import com.unmsm.ochotorres.Torre;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CeldaPresenter extends JButton implements ActionListener {
    
    private Tablero.Celda contenido;
    private Tablero tablero;
    private TableroPresenter panelTablero;
    
    

    
    //-------- Constructor con parametros para posicionar a los botones ------//
    public CeldaPresenter(Posicion posicion, Tablero.Celda contenido ){ 
        
        setBounds(posicion.pos_x, posicion.pos_y, posicion.ancho, posicion.alto);
        this.contenido=contenido;
        this.establecerIcono();
        addActionListener( this );
    }

    
    public void setImagen(String imagePath){
        ImageIcon icono=new ImageIcon(imagePath);     
        ImageIcon iconAjustado= new ImageIcon(icono.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        this.setIcon(iconAjustado);   
    }
    //------------------------------------------------------------------------//
    
    //------------------ Al darle click realizara este metodo ----------------//
    @Override
    public void actionPerformed( ActionEvent e ){ 
       int fila=contenido.posicionX;
       int columna=contenido.posicionY;
       try {
            tablero.agregarPieza(fila,columna, new Torre());

        } catch (FueraLimiteException ex) {
            Logger.getLogger(CeldaPresenter.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            panelTablero.construirEnBaseA(tablero);
        } catch (FueraLimiteException ex) {
            Logger.getLogger(CeldaPresenter.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    //------------------------------------------------------------------------//

    public void establecerContenido(Tablero.Celda celda) {
        this.contenido=celda;
    }
    

  
    private void establecerIcono() {
       switch(this.contenido.obtenerEstado()){
            case LIBRE: 
               if((this.contenido.posicionX+this.contenido.posicionY)%2==0){
                    setBackground(Color.PINK);}
               else{
                   setBackground(Color.WHITE);
               }
                   
                break;
            case OCUPADO :
                setImagen("torre.png");
                break;
            case RESTRINGIDO : 
                setBackground(Color.BLACK);
                break;      
        }   
    }

    void establecerContenedor(Tablero tablero) {
        this.tablero=tablero;
    }

    void establecerPanel(TableroPresenter panel) {
        panelTablero= panel;
    }
}