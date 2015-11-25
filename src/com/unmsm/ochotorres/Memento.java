/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres;
import java.util.*;
 
class Memento 
{
    private String state;
 
    public Memento(String stateToSave)
    {
        state = stateToSave; 
    }

    public String getSavedState()
    {
        return state; 
    }
}
 
class Originator 
{
    private String state;

    public void set(String state) 
    { 
       System.out.println("Iniciador: Setting state to "+state);
       this.state = state; 
    }

    public Memento saveToMemento() 
    { 
        System.out.println("Iniciador: Guardando para recordar.");
        return new Memento(state); 
    }

    public void restoreFromMemento(Memento m) 
    {
        state = m.getSavedState(); 
        System.out.println("Iniciador: Estado despues de restablecer del Memento: "+state);
    }
}   
 
class Caretaker {
   public  ArrayList<Memento> savedStates = new ArrayList<Memento>();
 
   public void addMemento(Memento m) { savedStates.add(m); }
   public Memento getMemento(int index) { return savedStates.get(index); }
}   
 
class MementoExample {
   public static void main(String[] args) {
       Caretaker caretaker = new Caretaker();

       Originator originator = new Originator();
       originator.set("cambio 1");
       caretaker.addMemento( originator.saveToMemento() );
       originator.restoreFromMemento( originator.saveToMemento());
       originator.set("cambio 2");

       
       originator.restoreFromMemento( originator.saveToMemento());

       caretaker.addMemento( originator.saveToMemento() );
       originator.set("cambio 3");
       caretaker.addMemento( originator.saveToMemento() );
       originator.set("cambio 4");
       
       originator.restoreFromMemento( originator.saveToMemento() );
       System.out.println("Estados guardados");
       
       for (Memento state : caretaker.savedStates) {
           System.out.println(state.getSavedState());
       }

      // originator.restoreFromMemento( caretaker.getMemento(1) );
   }
}

