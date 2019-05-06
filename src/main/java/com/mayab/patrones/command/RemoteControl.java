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
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControl() {
	onCommands = new Command[7];
	offCommands = new Command[7];
		
		
	//Inicializar comandos
	Command noCommand = new NoCommand();
	for(int i=0; i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
	}
	undoCommand = noCommand;
		
    }
	
    public void setCommand(int slot, Command onCommand, Command offCommand) {
    	this.onCommands[slot] = onCommand;
	this.offCommands[slot] = offCommand;
    }
	
    public void onButtonWasPressed(int slot) {
        this.onCommands[slot].execute();
	this.undoCommand = onCommands[slot];
    }
	
    public void offButtonWasPressed(int slot) {
	this.offCommands[slot].execute();
	this.undoCommand = offCommands[slot];
    }
	
    public void undoButtonWasPressed() {
	undoCommand.undo();
    }
	
    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
	stringBuff.append("\n----- Remote Control -----\n");
	for(int i=0; i<onCommands.length;i++) {
            stringBuff.append("[slot "+ i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
	}
	return stringBuff.toString();
    }
}
