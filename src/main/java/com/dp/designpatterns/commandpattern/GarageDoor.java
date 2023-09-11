package com.dp.designpatterns.commandpattern;

public class GarageDoor {

	public void up() {
		System.out.println("Garage is up");
	}
	
	public void down() {
		System.out.println("Garage is down");
	}
	
	public void stop() {
		System.out.println("Garage is stop");
	}
	
	public void lightOn() {
		System.out.println("Garage is on");
	}
	
	public void lightOff() {
		System.out.println("Garage is off");
	}
}
