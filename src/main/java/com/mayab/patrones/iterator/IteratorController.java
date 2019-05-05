/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

/**
 *
 * @author luisoliva
 */
public class IteratorController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Informatica info = new Informatica();
        Iterator iteratorInformatica = info.createIterator();
        System.out.println("Alumnos de informatica");
        print(iteratorInformatica);
                
        Industrial indus = new Industrial();
        Iterator iteratorIndustrial = indus.createIterator();
        System.out.println("Alumnos de industrial");
        print(iteratorIndustrial);
        
        Mecatronica meca = new Mecatronica();
        Iterator iteratorMeca = meca.createIterator();
        System.out.println("Alumnos de mecatronica");
        print(iteratorMeca);
        
        Civil civil = new Civil();
        Iterator iteratorCivil = civil.createIterator();
        System.out.println("Alumnos de civil");
        print(iteratorCivil);

        
        
    }
    
    public static void print(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n");
    }
    
    
}
