package com.dp.designpatterns.commandpattern;

public class GarageDoorCommand implements Command {

	GarageDoor door;
	
    public GarageDoorCommand(GarageDoor door) {
    	this.door = door;
    }
	
	public void execute() {

		door.down();
		door.up();
		door.stop();
	}

}
