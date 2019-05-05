/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisoliva
 */
public class Mecatronica {
    String nombre;
    List<String> alumnos;
    
    public Mecatronica(){
        this.nombre = "Mecatronica";
        this.alumnos = new ArrayList();
        this.alumnos.add("alan");
        this.alumnos.add("sebas");
        this.alumnos.add("benjamon");
    }
    
    public String getItem(int index){
        return this.alumnos.get(index);
    }
    
    public Iterator createIterator(){
        return new IteratorMecatronica(this.alumnos);
    }
}
