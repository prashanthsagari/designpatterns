package com.dp.designpatterns.factory.abstractfactorydp;

import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Cheese;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Clams;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Dough;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Pepperoni;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.PizzaIngredientFactory;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Sauce;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Veggies;

public class AndhraPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new RedCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new Eggplant() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
