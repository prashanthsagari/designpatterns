package com.dp.designpatterns.compositepattern;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public static void main(String[] args) {
		
	}
}
