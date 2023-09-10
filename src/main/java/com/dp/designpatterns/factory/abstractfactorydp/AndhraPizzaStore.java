package com.dp.designpatterns.factory.abstractfactorydp;

import com.dp.designpatterns.factory.abstractfactorydp.interfaces.PizzaIngredientFactory;

public class AndhraPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new AndhraPizzaIngredientFactory();
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.name = "Andhra Style Pizza";
		}
		return pizza;
	}

	
}
