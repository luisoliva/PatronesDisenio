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
public class StrategyController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBanco cuenta=new CuentaBanco();
        cuenta.transacciones.add(new Transaccion("02/12/2018", "Veterinaria", 20345, "Salud"));
        
    }
    
}
