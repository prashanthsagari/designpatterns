package com.dp.designpatterns.iteratordp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

	private List<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("Idly", "SOft idly powder", true, 40);
		addItem("Dosa", "breakfast", true, 50);
		addItem("Chicken butter masala", "curry", false, 250);
		
		
	}
	
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	
	
//	public Iterator createIterator() {
//		return new PancakeIterator(menuItems);
//	}
	
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
