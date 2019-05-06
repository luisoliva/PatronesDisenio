/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author luisoliva
 */
public class AdapterController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteOldPerson viejo = new ConcreteOldPerson("Luis", "Oliva", "17 de marzo 1998");
        ConcreteYoungPerson nuevo = new ConcreteYoungPerson("Luis Oliva", 21);
        
        OldPerson adaptado = new PersonAdapter(nuevo);
        
        System.out.println("Persona vieja");
        System.out.println("Nombre: "+viejo.getName()+"\nApellido: "+viejo.getLastName()+"\nFecha de nacimiento: "+viejo.getBirthday());
        
        System.out.println("\nPersona nueva");
        System.out.println("Nombre completo: "+nuevo.getFullName()+"\nEdad "+nuevo.getAge());
        
        System.out.println("\nPersona adaptada de nuevo a viejo");
        System.out.println("Nombre: "+adaptado.getName()+"\nApellido: "+adaptado.getLastName()+"\nFecha de nacimiento: "+adaptado.getBirthday());
    }
    
}
