package com.dp.designpatterns.factory.abstractfactorydp;

import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Cheese;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Clams;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Dough;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Pepperoni;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Sauce;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Veggies;

public abstract class Pizza {

	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake");
	}
	
	void box() {
		System.out.println("Pizza packed.");
	}
	
	
	
	
}
