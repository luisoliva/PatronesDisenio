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
public class SimpleRemoteControl {
    Command slot;
	
    public SimpleRemoteControl() {}
	
	
    public void setCommand(Command command) {
	this.slot = command;
    }
	
    public void buttonWasPressed() {
	slot.execute();
    }
}
