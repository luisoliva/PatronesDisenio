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
public class Angus extends Burger{
    public double getCost(){
        return 30;
    }

    @Override
    public String getDescription() {
        return "Esta es una hamburguesa Angus";
    }
}
