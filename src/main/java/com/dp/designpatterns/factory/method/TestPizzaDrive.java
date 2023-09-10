package com.dp.designpatterns.factory.method;

public class TestPizzaDrive {

	public static void main(String[] args) {

		PizzaStore andhra = new AndhraPizzaStore();
		PizzaStore karnataka = new KarnatakaPizzaStore();
		
		andhra.orderPizza("chicken");
		karnataka.orderPizza("tomato");
		
	}

}
