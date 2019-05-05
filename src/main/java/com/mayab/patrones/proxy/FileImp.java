/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author luisoliva
 */
public class FileImp implements File {

    public User user;
    
    public FileImp(User user){
        this.user=user;
    }
    
    @Override
    public void borrar() {
        if (this.user.type=="super-usuario"){
            System.out.println("Documento borrado");
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public void escribir() {
        System.out.println("Escribiendo documento");
    }

    @Override
    public void leer() {
        System.out.println("leyendo documento");
    }
    
    
}
