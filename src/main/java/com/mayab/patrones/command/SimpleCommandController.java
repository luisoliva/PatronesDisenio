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
public class SimpleCommandController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleRemoteControl remote = new SimpleRemoteControl();
		
	Light light = new Light("Living Room");	
	LightOnCommand lightOn = new LightOnCommand(light);
		
	GarageDoor garageDoor = new GarageDoor();
	GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
	remote.setCommand(lightOn);
	remote.buttonWasPressed();
		
	remote.setCommand(garageOpen);
	remote.buttonWasPressed();
    }
    
}
