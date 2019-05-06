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
public class StereoOffCommand implements Command{
    Stereo stereo;
	
    public StereoOffCommand(Stereo stereo) {
	this.stereo = stereo;
    }
	
    @Override
    public void execute() {
	this.stereo.off();
    }
	
    @Override
    public void undo() {
	this.stereo.on();
    }
}
