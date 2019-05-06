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
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
	
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
	this.garageDoor = garageDoor;
    }
	
    @Override
    public void execute() {
	this.garageDoor.down();
		
    }
	
    @Override
    public void undo() {
	this.garageDoor.up();
    }
}
