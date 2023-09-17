package com.dp.designpatterns.compositepattern;

public class TestDriveComposite {

	public static void main(String[] args) {

		MenuComponent pancakeHouse = new Menu("PANCAKE", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouse);
		allMenus.add(dessertMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("Pasta", "Spaghetti", true, 20));
		dinerMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}

}
