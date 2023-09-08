package com.dp.designpatterns.strategy;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("mute quack");
	}

}
