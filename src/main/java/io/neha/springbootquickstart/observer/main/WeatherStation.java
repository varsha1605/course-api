package io.neha.springbootquickstart.observer.main;

import io.neha.springbootquickstart.observer.impl.ForecastDisplay;
import io.neha.springbootquickstart.observer.impl.StatisticsDisplay;
import io.neha.springbootquickstart.observer.impl.WeatherData;

public class WeatherStation {
	
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		statisticsDisplay.registerObserver();
		
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		forecastDisplay.registerObserver();
		
		weatherData.setWeatherData(80, 65, 30.4f);
		weatherData.setWeatherData(82, 70, 29.2f);
		weatherData.setWeatherData(78, 90, 45.6f);
		
		forecastDisplay.removeObserver();
		
		weatherData.setWeatherData(9, 10, 30.4f);
	}
}
