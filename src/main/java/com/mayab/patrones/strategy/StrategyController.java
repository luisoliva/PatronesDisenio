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
        ReporteFecha fecha = new ReporteFecha();
        fecha.desplegarTransacciones();
        
        ReporteCategoria categoria = new ReporteCategoria();
        categoria.desplegarTransacciones();
        
        ReporteCantidad cantidad = new ReporteCantidad();
        cantidad.desplegarTransacciones();

        ReporteComercio comercio =  new ReporteComercio();
        comercio.desplegarTransacciones();
        
        

        
    }
    
}
