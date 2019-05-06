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
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
	
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
	this.garageDoor = garageDoor;
    }
	
    @Override
    public void execute() {
	this.garageDoor.up();
		
    }
	
    @Override
    public void undo() {
	this.garageDoor.down();
    }
}
