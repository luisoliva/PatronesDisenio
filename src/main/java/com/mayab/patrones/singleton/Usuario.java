/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author luisoliva
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private boolean logeado;
    private static Usuario singletonInstance;
    
    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public static Usuario getInstance(String nombre, String apellido){
        if (Usuario.singletonInstance == null){
            Usuario.singletonInstance = new Usuario(nombre,apellido);
        }
        return Usuario.singletonInstance;
    }
    
    public void logIn(){
        this.logeado = true;
    }
    
    public void logOut(){
        this.logeado = false;
    }
    
    public boolean getStatus(){
        return this.logeado;
    }
    
    public String getName(){
        return this.nombre;
    }
    
    
}
