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
public class ConcreteYoungPerson implements YoungPerson{
    public String fullname;
    public int age;
    
    public ConcreteYoungPerson(String fullname, int age){
        this.fullname=fullname;
        this.age=age;
    }

    @Override
    public String getFullName() {
        return this.fullname;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setFullName(String fullname) {
        this.fullname=fullname;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }
}
