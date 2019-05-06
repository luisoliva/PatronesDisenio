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
public class NoCommand implements Command{
    public NoCommand() {}
	
    @Override
    public void execute() {
	//Does nothing.
		
    }

    @Override
    public void undo() {
	//Does nothing
    }
}
