/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;
import java.util.ArrayList;

/**
 *
 * @author luisoliva
 */
public class Informatica {
    public String nombre;
    public ArrayList<String> alumnos;
    
    public Informatica(){
        this.nombre = "Informatica";
        this.alumnos = new ArrayList<String>();
        this.alumnos.add("Luis");
        this.alumnos.add("Alberto");
        this.alumnos.add("Oliva");
    }
    
    public String getItem(int index){
        return this.alumnos.get(index);
    }
    
    public Iterator createIterator(){
        return new IteratorInformatica(this.alumnos);
    }
}
