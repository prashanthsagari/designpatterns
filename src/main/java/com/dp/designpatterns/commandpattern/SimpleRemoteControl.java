package com.dp.designpatterns.commandpattern;
// consider this as waitress in a hotel
public class SimpleRemoteControl {

	Command slot;
	
	// creating order
    public void setCommand(Command command) {
    	slot = command;
    }
    
    public void buttonWasPressed() {
    	slot.execute();
    }
}
