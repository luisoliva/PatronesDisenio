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
public class ProxyFile implements File{
    public FileImp file;
    
    
    public ProxyFile(User user){
        this.file=new FileImp(user);
    }

    @Override
    public void borrar() {
        this.file.borrar();
    }

    @Override
    public void escribir() {
        this.file.escribir();
    }

    @Override
    public void leer() {
        this.file.leer();
    }
    
}
