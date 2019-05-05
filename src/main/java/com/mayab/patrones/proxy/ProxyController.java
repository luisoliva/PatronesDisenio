/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author luisoliva
 */
public class ProxyController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Super usuario intenta borrar documento...");
        User usuario = new User("super-usuario");
        ProxyFile proxy=new ProxyFile(usuario);
        proxy.borrar();
        
        System.out.println("\nUsuario normal intenta borrar documento...");
        User usuario2 = new User("usuario");
        proxy=new ProxyFile(usuario2);
        proxy.borrar();

        
    }
    
}
