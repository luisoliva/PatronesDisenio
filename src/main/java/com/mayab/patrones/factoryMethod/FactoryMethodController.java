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
public class FactoryMethodController {
    public static void main(String [ ] args)
    {
        TrianguloCreator mi_triangulo = new TrianguloEscalenoCreator();
        Triangulo t=  mi_triangulo.obtenerTriangulo("escaleno");
        System.out.println(t.area()+ " " + ((TrianguloEscaleno)t).tipo);
    }
}
