package com.dp.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);

	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for (Observer observer : observers) {
			observer.update();
		}

	}
	
	public void publishNewChanges(float temperature, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		notifyObservers();
	}
	
	private float temperature;
	private float pressure;

	@Override
	public String toString() {
		return "WeatherData [temperature=" + temperature + ", pressure=" + pressure + "]";
	}

}
