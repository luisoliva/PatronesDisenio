/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author luisoliva
 */
public class TemplateController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("actualizando persona con datos invalidos");
        Persona p=new Persona("Luis", "Merida", 20);        
        p.actualizar(17);
         
        System.out.println("\nactualizando producto con datos invalidos");
        Producto pp=new Producto("123", 11);
        pp.actualizar(9);
        
        System.out.println("\nactualizando persona con datos validos");
        Persona pv=new Persona("Luis", "Merida", 20);        
        pv.actualizar(19);
         
        System.out.println("\nactualizando producto con datos validos");
        Producto ppv=new Producto("123", 11);
        ppv.actualizar(11);
    }
    
}
