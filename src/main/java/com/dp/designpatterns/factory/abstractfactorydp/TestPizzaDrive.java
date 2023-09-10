package com.dp.designpatterns.factory.abstractfactorydp;


public class TestPizzaDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore andhraStore = new AndhraPizzaStore();
		Pizza pizza = andhraStore.orderPizza("cheese");
		System.out.println(pizza);
	}

}
