package com.dp.designpatterns.iteratordp;

import java.util.List;

public class PancakeIterator implements Iterator {
	
	List<MenuItem> menuItems;
	int position = menuItems.size();

	public PancakeIterator(List<MenuItem> menuItems) {
          this.menuItems = menuItems;
	}

	public boolean hasNext() {
		return menuItems.size() > position;
	}

	public MenuItem next() {
		return menuItems.get(position++);
	}

}
