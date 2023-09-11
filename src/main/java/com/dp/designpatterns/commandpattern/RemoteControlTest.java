package com.dp.designpatterns.commandpattern;

public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		GarageDoor door = new GarageDoor();
		GarageDoorCommand garageCommand = new GarageDoorCommand(door);
		
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();
		
		remote.setCommand(garageCommand);
		remote.buttonWasPressed();
	}

}
