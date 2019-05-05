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
public class Producto extends Catalogo {
    String codigo;
    double precio;

    public Producto(String codigo, double precio){
        this.codigo=codigo;
        this.precio=precio;
    }
    
    @Override
    boolean validarDatos(double numero) {
        boolean flag=false;
        if (numero>10){
            flag=true;
        }else{
            flag=false;
        }
        
        return flag;
    }
    
    @Override
    void guardar(double precio){
        this.precio=precio;
    }

   
    
}
