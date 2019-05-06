/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author luisoliva
 */
public class ObserverController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vuelo mexico = new Vuelo("A1","23:00","a tiempo","mexico");
        Vuelo merida = new Vuelo ("B23","12:10", "a tiempo", "merida");
        
        Persona luis = new Persona("Luis",mexico);
        Persona alberto = new Persona("Alberto",mexico);
        Persona alan = new Persona ("Alan",merida);
        
        merida.addObserverToList(alan);
        mexico.addObserverToList(alberto);
        mexico.addObserverToList(luis);
        
        mexico.setEstado("retrasado");
        merida.setSala("A2");
    }     
}
