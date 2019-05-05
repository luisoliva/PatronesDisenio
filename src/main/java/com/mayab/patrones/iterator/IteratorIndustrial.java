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
public class IteratorIndustrial implements Iterator {
    public String coleccion[];
    public int position = 0;
    
    public IteratorIndustrial(String[] coleccion){
        this.coleccion = coleccion;
    }
    
    @Override
    public boolean hasNext(){
       if (this.position<coleccion.length){
           return true;
       }else{
           return false;
       }
    }
    
    @Override
    public Object next(){
        Object objeto = coleccion[this.position];
        this.position++;
        return objeto;
    }
}
