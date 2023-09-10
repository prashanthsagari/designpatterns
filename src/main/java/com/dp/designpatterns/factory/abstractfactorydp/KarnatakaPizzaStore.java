package com.dp.designpatterns.factory.abstractfactorydp;

import com.dp.designpatterns.factory.abstractfactorydp.interfaces.PizzaIngredientFactory;

public class KarnatakaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new AndhraPizzaIngredientFactory();
		if (item.equals("veggie")) {
			new CheesePizza(ingredientFactory);
			pizza.name = "Karnataka Style Pizza";
		}
		return pizza;
	}

}
