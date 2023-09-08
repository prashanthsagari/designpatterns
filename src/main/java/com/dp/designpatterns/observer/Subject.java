package com.dp.designpatterns.observer;

// publisher implements subject
public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
