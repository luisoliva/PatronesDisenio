/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author luisoliva
 */
public class Civil {
    String nombre;
    Queue alumnos;
    
    public Civil(){
        this.nombre = "Civil";
        this.alumnos = new LinkedList ();
        this.alumnos.add("manuel");
        this.alumnos.add("alex");
        this.alumnos.add("kks");
    }
    
    public String getItem(){
        return (String) this.alumnos.poll();
    }
    
    public Iterator createIterator(){
        return new IteratorCivil(this.alumnos);
    }
}
