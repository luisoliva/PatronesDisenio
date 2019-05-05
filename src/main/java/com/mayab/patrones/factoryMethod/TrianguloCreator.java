/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author luisoliva
 */
public abstract class TrianguloCreator {
    abstract Triangulo factoryMethod(String tipo);
    
    public Triangulo obtenerTriangulo(String tipo){
        Triangulo instancia = factoryMethod(tipo);
        System.out.println("---Obteniendo un " + instancia.getClass()+"---");
        instancia.area();
        instancia.perimetro();
        
        return instancia;
    }
}
