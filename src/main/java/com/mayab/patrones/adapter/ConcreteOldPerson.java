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
public class ConcreteOldPerson implements OldPerson{
    public String name;
    public String lastname;
    public String bithday;
    
    public ConcreteOldPerson(String nombre, String apellido, String cumple){
        this.name=nombre;
        this.lastname=apellido;
        this.bithday=cumple;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.lastname;
    }

    @Override
    public String getBirthday() {
        return this.bithday;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname=lastName;
    }

    @Override
    public void setBirthday(String birthday) {
        this.bithday=birthday;
    }
    
}
