/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.util;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Aleatorio {
  
   public static int obtenerNumero(int minimo,int maximo){
        return (int)Math.floor(Math.random()*(minimo-maximo)+maximo);
   }
    
    
    
}
