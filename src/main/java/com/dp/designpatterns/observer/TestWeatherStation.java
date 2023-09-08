package com.dp.designpatterns.observer;

public class TestWeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.registerObserver(currentConditionDisplay);
		weatherData.publishNewChanges(22f, 33f);
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.publishNewChanges(55f, 35f);

	}

}
