package com.dp.designpatterns.observer;

public class CurrentConditionDisplay implements Observer {

	private WeatherData weatherData;

	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	public void update() {
		System.out.println(weatherData);
	}

}
