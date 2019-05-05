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
public class SortComercio implements Sortable{

    @Override
    public void sort() {
        System.out.println("ordenando por comercio");
    }
    
}
