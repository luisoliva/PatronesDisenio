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
    Reporte reporte;
    
    public CuentaBanco(){
        this.transacciones=new ArrayList<Transaccion>();
    }
}
