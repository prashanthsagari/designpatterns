package com.dp.designpatterns.iteratordp;

import java.util.Iterator;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem);
		}
	}
	
	public void printMenu() {
		java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		printMenu(pancakeIterator);
		printMenu(dinerIterator);
		
	}
}
