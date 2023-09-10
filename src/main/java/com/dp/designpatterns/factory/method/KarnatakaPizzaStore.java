package com.dp.designpatterns.factory.method;

public class KarnatakaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("tomato")) {
			return new KarnatakaStylePizza();
		} 
		return null;
	}

}
