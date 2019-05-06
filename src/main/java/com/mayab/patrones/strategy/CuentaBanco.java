/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;
/**
 *
 * @author luisoliva
 */
public class CuentaBanco {
    ArrayList<Transaccion> transacciones;
    public double estadoDeCuenta;
    
    public CuentaBanco(){
        this.transacciones=new ArrayList<Transaccion>();
        this.estadoDeCuenta = 0;
    }
    
    public void agregarTransaccion(Transaccion t){
        this.transacciones.add(t);
        this.estadoDeCuenta = this.estadoDeCuenta + t.cantidad;
    }
    
    public void eliminarTransaccion(Transaccion t){
        this.transacciones.remove(t);
        this.estadoDeCuenta = this.estadoDeCuenta - t.cantidad;
    }
}
