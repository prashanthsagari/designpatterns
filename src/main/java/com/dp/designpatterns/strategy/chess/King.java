package com.dp.designpatterns.strategy.chess;

public class King extends Character {

	@Override
	public void fight() {
		setWeaponBehavior(new KnifeBehavior());
		weaponBehavior.useWeapon();
	}

	public static void main(String[] args) {
		King king = new King();
		king.fight();
	}
}
