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
public class IteratorInformatica implements Iterator{
    public ArrayList<String> coleccion;
    public int position = 0;
    
    public IteratorInformatica(ArrayList<String> coleccion){
        this.coleccion = coleccion;
    }
    
    @Override
    public boolean hasNext(){
       if (this.position<coleccion.size()){
           return true;
       }else{
           return false;
       }
    }
    
    @Override
    public Object next(){
        Object objeto = coleccion.get(this.position);
        this.position++;
        return objeto;
    }
}
