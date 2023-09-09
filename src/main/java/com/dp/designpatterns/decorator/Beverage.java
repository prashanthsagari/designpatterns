package com.dp.designpatterns.decorator;

// abstract component 
public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
