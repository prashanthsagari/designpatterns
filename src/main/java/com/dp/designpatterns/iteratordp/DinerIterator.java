package com.dp.designpatterns.iteratordp;

public class DinerIterator implements java.util.Iterator<MenuItem> {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
		
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position += position;
		return menuItem;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("Dont try to remove items.");
	}

}
