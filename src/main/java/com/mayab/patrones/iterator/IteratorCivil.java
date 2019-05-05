/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Queue;

/**
 *
 * @author luisoliva
 */
public class IteratorCivil implements Iterator{
    public Queue coleccion;
    public int position = 0;
    
    public IteratorCivil(Queue coleccion){
        this.coleccion = coleccion;
    }
    
    @Override
    public boolean hasNext(){
       if (coleccion.isEmpty()){
           return false;
       }else{
           return true;
       }
    }
    
    @Override
    public Object next(){
        Object objeto = coleccion.poll();
        this.position++;
        return objeto;
    }
}
