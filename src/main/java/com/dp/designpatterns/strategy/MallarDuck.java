package com.dp.designpatterns.strategy;

public class MallarDuck extends Duck {

	public MallarDuck() {
	 quackBehavior = new Quack();
	 flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {

		System.out.println("Mallard Duck");
	}

	public static void main(String[] args) {
		MallarDuck duck = new MallarDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
	}
}
