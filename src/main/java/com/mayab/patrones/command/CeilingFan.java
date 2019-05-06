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
public class CeilingFan {
    String location;
		
    public CeilingFan(String location) {
	this.location = location;
    }
		
    public void on() {
	System.out.println("Ceiling fan on in "+ this.location);
    }
		
    public void off() {
	System.out.println("Ceiling fan off in "+ this.location);
    }
}
