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
public class TrianguloEquilateroCreator  extends TrianguloCreator{
    @Override
    Triangulo factoryMethod(String tipo) {
        if (tipo.equals("equilatero")){
            return new TrianguloEquilatero();
        }else{
            return null;
        }
        
    }
}
