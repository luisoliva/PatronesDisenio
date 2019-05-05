/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author luisoliva
 */
public class Transaccion {
    String fecha;
    String comercio;
    double cantidad;
    String categoria;
    
    public Transaccion(String fecha, String comercio, double cantidad, String categoria){
        this.fecha=fecha;
        this.cantidad=cantidad;
        this.categoria=categoria;
        this.comercio=comercio;
    }
}
