package com.dp.designpatterns.template;

public abstract class AbstractClass {

	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
	}
	
	abstract void primitiveOperation1();
	abstract void primitiveOperation2();
	
	final void concreteOperation() {
		System.out.println("concrete operation");
	}
	
	void hook() {}
	
}
