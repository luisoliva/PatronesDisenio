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
        String cadena=this.adaptada.getFullName();
        String[] parts = cadena.split(" ");
        String part1 = parts[0];
        return part1;
    }

    @Override
    public String getLastName() {
        String cadena=this.adaptada.getFullName();
        String[] parts = cadena.split(" ");
        String part2 = parts[1];
        
        return part2;    
    }

    @Override
    public String getBirthday() {
        Integer edad=2019 - this.adaptada.getAge();
        String fecha = "17 de marzo de ";
        return fecha + edad.toString();    
    }

    @Override
    public void setName(String name) {
        this.adaptada.setFullName(name);
    }

    @Override
    public void setLastName(String lastName) {
        this.adaptada.setFullName(this.adaptada.getFullName() + lastName);   
    }

    @Override
    public void setBirthday(String birthday) {
        String lastFourDigits = birthday.substring(birthday.length() - 4);
        int año = Integer.parseInt(lastFourDigits);
        this.adaptada.setAge(2019-año);
    }
    
}
