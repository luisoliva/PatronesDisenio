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
public class FactoryController {
    public static void main(String [ ] args)
    {
        System.out.println("Creando una instancia de un triangulo escaleno en un objeto de un triagulo generico...");
        TrianguloCreator mi_triangulo = new TrianguloEscalenoCreator();
        System.out.println("Obteniendo tipo de triangulo creado desde el objeto generico...");
        Triangulo t=  mi_triangulo.obtenerTriangulo("escaleno");
        System.out.println(t.area()+ " " + ((TrianguloEscaleno)t).tipo);
    }
}
