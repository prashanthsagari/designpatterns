package com.dp.designpatterns.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
