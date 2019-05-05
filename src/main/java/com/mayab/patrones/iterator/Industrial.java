/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

/**
 *
 * @author luisoliva
 */
public class Industrial {
    String nombre;
    String[] alumnos;
    
    public Industrial(){
        this.nombre = "Industrial";
        this.alumnos = new String[3];
        this.alumnos[0]=("karena");
        this.alumnos[1]=("katia");
        this.alumnos[2]=("lalo");
    }
    
    public String getItem(int index){
        return this.alumnos[index];
    }
    
    public Iterator createIterator(){
        return new IteratorIndustrial(this.alumnos);
    }
}
