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
public class Veggie extends Burger{

    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Esta es una hamburguesa vegetariana"; 
    }
    
}
