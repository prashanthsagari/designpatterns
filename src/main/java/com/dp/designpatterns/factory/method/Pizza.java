package com.dp.designpatterns.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	 String name;
	 String dough;
	 String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Prepare ");
		System.out.println("Adding toppings:");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
	}
	
	void box() {
		System.out.println("Pizza packed.");
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}
	
	
	
}
