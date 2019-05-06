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
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
	
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
	this.ceilingFan = ceilingFan;
    }
	
    @Override
    public void execute() {
        this.ceilingFan.off();
    }
	
    @Override
    public void undo() {
	this.ceilingFan.on();
    }
}
