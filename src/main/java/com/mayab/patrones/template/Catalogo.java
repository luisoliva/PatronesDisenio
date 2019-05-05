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
public abstract class Catalogo {
    abstract boolean validarDatos(double numero);

    
    final void actualizar(double numero){
        leerDatos();
        if(validarDatos(numero)==true){
            guardar(numero);
            System.out.println("datos guardados correctamente");
        }else{
            error();
        }
    }
        
    abstract void guardar(double numero);
    
    void leerDatos(){
        System.out.println("leyendo datos");
    }
    
    void error(){
        System.out.println("error");
    }

}
