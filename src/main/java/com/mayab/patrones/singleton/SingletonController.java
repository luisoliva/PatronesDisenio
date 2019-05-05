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
        
        Usuario user = Usuario.getInstance("Luis","Oliva");
        System.out.println(user.getName());
        System.out.println(user.getStatus());
        
        Usuario user2 = Usuario.getInstance("Pepe","perez");
        System.out.println(user2.getName());
        user2.logIn();
        System.out.println(user.getStatus());
    }   
}
