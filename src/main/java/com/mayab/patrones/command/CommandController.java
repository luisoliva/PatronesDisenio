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
public class CommandController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear los receptores
	Light livingRoomLight = new Light("Living Room");
	Light kitchenLight = new Light("Kitchen");
	CeilingFan ceilingFan = new CeilingFan("Living Room");
	GarageDoor garageDoor = new GarageDoor();
	Stereo stereo = new Stereo("Bedroom");
		
	//Crear los comandos
	LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
	LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
	
	LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
	LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
	
	CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
	CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
	
	GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
	GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
	
	StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
	StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	
	//Crear macro comando
	Command[] partyOn = {livingRoomLightOn, kitchenLightOn, ceilingFanOn, garageDoorOpen, stereoOn};
	Command[] partyOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, garageDoorClose, stereoOff};
	
	MacroCommand partyMacroOn = new MacroCommand(partyOn);
	MacroCommand partyMacroOff = new MacroCommand(partyOff);
	
	
	//Crear el control
	RemoteControl remote = new RemoteControl();
	
	//Asignar comandos a botones del control
	
	remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
	remote.setCommand(1, kitchenLightOn, kitchenLightOff);
	remote.setCommand(2, ceilingFanOn, ceilingFanOff);
	remote.setCommand(3, garageDoorOpen, garageDoorClose);
	remote.setCommand(4, stereoOn, stereoOff);
	remote.setCommand(5, partyMacroOn, partyMacroOff); //Macro
	
	//Visualizar comandos asignados
	System.out.println(remote);
	
	//Presionar botones
	remote.onButtonWasPressed(0);
	remote.offButtonWasPressed(0);
	
	remote.onButtonWasPressed(1);
	remote.offButtonWasPressed(1);
	
	
	remote.undoButtonWasPressed(); //First undo
	
	remote.onButtonWasPressed(2);
	remote.offButtonWasPressed(2);
	
	remote.onButtonWasPressed(3);
	remote.offButtonWasPressed(3);
	
	
	remote.undoButtonWasPressed(); //Second undo
	
	remote.onButtonWasPressed(4);
	remote.offButtonWasPressed(4);
	
	System.out.println("\n Macro \n");
	remote.onButtonWasPressed(5);
	
	
    }    
}
