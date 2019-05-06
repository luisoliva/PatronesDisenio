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
public class GarageDoor {
    public GarageDoor() {}
	
    public void up() {
        System.out.println("Garage door up.");
    }
	
    public void down() {
	System.out.println("Garage door down.");
    }
	
    public void stop() {
	System.out.println("Garage door stopped.");
    }
	
    public void lightOn() {
	System.out.println("Garage door's lights on.");
    }
	
    public void lightOff() {
	System.out.println("Garage door's lights off.");
    }
}
