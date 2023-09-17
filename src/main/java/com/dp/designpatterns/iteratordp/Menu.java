package com.dp.designpatterns.iteratordp;

import java.util.Iterator;

public interface Menu {

	public Iterator<MenuItem> createIterator();
}
