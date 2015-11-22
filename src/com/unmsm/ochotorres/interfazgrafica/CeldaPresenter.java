package com.unmsm.ochotorres.interfazgrafica;

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
    public CeldaPresenter( int pos_x, int pos_y, int ancho, int alto ){ 
        //Se coloca el boton en un lugar y se le da un tamanio
        
        setBounds(pos_x, pos_y, ancho, alto);
               
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
    }
    //------------------------------------------------------------------------//
    
    //---------------------- Se asigna una el nombre del boton ---------------//
    public void setNombre( int f, int c ){
        setText( f + " , " + c );
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
       
       panelTablero.construirTablero(tablero);
       
    }
    //------------------------------------------------------------------------//

    public void establecerContenido(Tablero.Celda celda) {
        this.contenido=celda;
    }
    

  
    public void establecerIcono(Tablero.Celda.Estado estado) {
        switch(estado){
            case LIBRE: setBackground(Color.GRAY);
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