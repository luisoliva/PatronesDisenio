/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author luisoliva
 */
public class Persona extends Catalogo{
    String nombre;
    String direccion;
    double edad;
    
    public Persona(String nombre, String direccion, double edad){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
    }
   
    @Override
    boolean validarDatos(double numero) {
        boolean flag=false;
        if (numero>18){
            flag=true;
        }else{
            flag=false;
        }
        
        return flag;
    }
    
     @Override
    void guardar(double numero){
        this.edad=numero;
    }
}
