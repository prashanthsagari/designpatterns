package com.dp.designpatterns.factory.method;


public class AndhraPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("chicken")) {
			return new AndhraStyleChickenPizza();
		} else if (item.equals("veggie")) {
			return new AndhraStyleVegPizza();
		} return null;
	}

	

}
