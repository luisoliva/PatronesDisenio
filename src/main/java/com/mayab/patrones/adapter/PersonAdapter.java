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
public class PersonAdapter implements OldPerson {
    
    YoungPerson adaptada;

    public PersonAdapter(YoungPerson nueva){
        this.adaptada=nueva;
    }
    
    @Override
    public String getName() {
        String cadena=this.adaptada.getName();
        String[] parts = cadena.split(" ");
        String part1 = parts[0];
        
        return part1;
    }

    @Override
    public String getLastName() {
        String cadena=this.adaptada.getName();
        String[] parts = cadena.split(" ");
        String part2 = parts[1];
        
        return part2;    
    }

    @Override
    public String getBirthDate() {
        Integer cadena=this.adaptada.getAge();
        
        return cadena.toString();    
    }

    @Override
    public void setName(String name) {
        String cadena=name;
        String[] parts = cadena.split(" ");
        String part1 = parts[1];
        this.adaptada.setName(name + " " + part1);
    }

    @Override
    public void setLastName(String lastName) {
        String cadena=lastName;
        String[] parts = cadena.split(" ");
        String part2 = parts[1];
        this.adaptada.setName(part2);   
    }

    @Override
    public void setBirthDate(String birthDate) {
    }
    
}
