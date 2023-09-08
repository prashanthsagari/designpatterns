package com.dp.designpatterns.strategy.chess;

public abstract class Character {

	public WeaponBehavior weaponBehavior;
	
	public abstract void fight();
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
}
