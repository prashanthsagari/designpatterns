package com.dp.designpatterns.factory.abstractfactorydp;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.name + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.box();
		return pizza;
	}
}
