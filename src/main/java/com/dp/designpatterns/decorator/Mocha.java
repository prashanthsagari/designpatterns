package com.dp.designpatterns.decorator;

// concrete decorator
public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 20;
	}

}
