/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author luisoliva
 */
public class DecoratorController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("creando e imprimiendo descripcion de una hamburguesa angus...");
        Burger instancia = new Angus();
        System.out.println(instancia.getDescription() + " con costo base de  "+ instancia.getCost());

        System.out.println("\ncreando una hamburguesa vegetariana...");
        Burger veg = new Veggie();
        
        System.out.println("costo parcial: " + veg.getCost() + "\nagregandole guacamole...");
        veg = new Guacamole(veg);
        
        System.out.println("costo parcial: " + veg.getCost() + "\nagregandole tocino...");
        veg = new Bacon(veg);
        System.out.println("costo parcial: " + veg.getCost() + "\nPedido finalizado");
        System.out.println("\nCuenta de la hamburguesa: " + veg.getDescription() +" y su costo total es de " +veg.getCost());

        
    }
    
}
