package com.dp.designpatterns.iteratordp;

public class DinerMenu implements Menu {

	static final int MAX_ITEMS = 2;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Idly", "SOft idly powder", true, 40);
		addItem("Dosa", "breakfast", true, 50);
		addItem("Chicken butter masala", "curry", false, 250);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems[numberOfItems] = menuItem;
		numberOfItems += 1;
	}

	public java.util.Iterator<MenuItem> createIterator() {
		return new DinerIterator(menuItems);
	}
}
