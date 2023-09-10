package com.dp.designpatterns.factory.abstractfactorydp;

import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Cheese;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Clams;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Dough;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Pepperoni;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.PizzaIngredientFactory;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Sauce;
import com.dp.designpatterns.factory.abstractfactorydp.interfaces.Veggies;

public class KarnatakaPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrushDough();
	}
 
	public Sauce createSauce() {
		return new TomatoSauce();
	}
 
	public Cheese createCheese() {
		return new YellowCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new Eggplant() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrogenClams();
	}

}
