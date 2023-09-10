package com.dp.designpatterns.factory.method;

public abstract class PizzaStore {

	abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("Making pizza " + pizza.name);
		pizza.prepare();
		pizza.box();
		return pizza;
	}
}
