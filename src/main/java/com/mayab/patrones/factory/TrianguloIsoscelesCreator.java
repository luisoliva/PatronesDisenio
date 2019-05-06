/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factory;

/**
 *
 * @author luisoliva
 */
public class TrianguloIsoscelesCreator extends TrianguloCreator{
    @Override
    Triangulo factoryMethod(String tipo) {
        if (tipo.equals("isosceles")){
            return new TrianguloIsosceles();
        }else{
            return null;
        }
    }
    
}
