/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.command;

/**
 *
 * @author luisoliva
 */
public class Light {
    String location;
	
    public Light(String location) {
	this.location = location;
    }
	
    public void on() {
	System.out.println("Lights on in "+ this.location);
    }
	
    public void off() {
	System.out.println("Lights off in "+this.location);
    }
    
}
