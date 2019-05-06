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
public class LightOffCommand implements Command{
    Light light;
	
    public LightOffCommand(Light light) {
	this.light = light;
    }
	
    @Override
    public void execute() {
	this.light.off();
    }
	
    @Override 
    public void undo() {
	this.light.on();
    }
}
