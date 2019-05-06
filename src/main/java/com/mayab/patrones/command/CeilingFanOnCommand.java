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
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
	
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
	this.ceilingFan = ceilingFan;
    }
	
    @Override
    public void execute() {
        this.ceilingFan.on();
    }
	
    @Override
    public void undo() {
	this.ceilingFan.off();
    }
}
