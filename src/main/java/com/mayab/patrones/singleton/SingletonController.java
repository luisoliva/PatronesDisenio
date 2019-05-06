/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author luisoliva
 */
public class SingletonController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("creacion de una instancia de singleton");
        Usuario user = Usuario.getInstance("Luis","Oliva");
        System.out.println("nombre: "  + user.getName());
        System.out.println("logeado: " + user.getStatus());
        
        System.out.println("\ncreacion de una nueva instancia de singleton con datos distintos y logeada");
        Usuario user2 = Usuario.getInstance("Pepe","perez");
        System.out.println("nombre: " + user2.getName());
        user2.logIn();
        System.out.println("logeado: " + user.getStatus());
    }   
}
