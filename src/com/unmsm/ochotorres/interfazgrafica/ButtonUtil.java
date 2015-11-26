/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres.interfazgrafica;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class ButtonUtil {
    public static void ponerIcono(JButton boton, String imagePath) {
        new ButtonUtil().setImagen(boton, imagePath);
    }
    
    public void setImagen(JButton boton, String imagePath) {
        ImageIcon icono = new ImageIcon(getClass().getResource(imagePath));
        ImageIcon iconAjustado = new ImageIcon(icono.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        boton.setIcon(iconAjustado);
    }
}
