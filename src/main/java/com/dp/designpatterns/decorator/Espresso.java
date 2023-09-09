package com.dp.designpatterns.decorator;

// concrete component
public class Espresso extends Beverage {

	public Espresso() {
	  description = "Espresso";	
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 199;
	}

}
