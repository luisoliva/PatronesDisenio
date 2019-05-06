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
public class Persona implements Observer {
    public String nombre;
    public Vuelo vuelo;
    public Persona(String nombre, Vuelo vuelo){
        this.nombre = nombre;
        this.vuelo = vuelo;
    }
    
    public void alert(){
    System.out.println("Notificación de vuelo para " + this.nombre);
    System.out.println("Sala: "+vuelo.sala);
    System.out.println("Hora de salida: "+vuelo.salida);
    System.out.println("Status: "+vuelo.status);
    System.out.println("Destino: "+vuelo.destino);
    System.out.println("");
    }
    
    @Override
    public void update() {
        this.alert();
    }
}
