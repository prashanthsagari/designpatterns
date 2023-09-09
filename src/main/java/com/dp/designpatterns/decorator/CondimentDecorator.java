package com.dp.designpatterns.decorator;

// abstract decorator
public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public abstract String getDescription();

}
