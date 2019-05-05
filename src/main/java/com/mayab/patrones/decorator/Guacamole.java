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
public class Guacamole extends Decorator {
    Burger burger;
    
    public Guacamole(Burger burger){
        this.burger=burger;
    }
    
    @Override
    public String getDescription() {
        return burger.getDescription()+", guacamole";
    }

    @Override
    public double getCost() {
        return burger.getCost()+6; 
    }
    
}
