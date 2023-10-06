package io.neha.springbootquickstart.observer.impl;

import io.neha.springbootquickstart.observer.spi.Observer;

public class StatisticsDisplay implements Observer {

	private float temperature;
	private float humidity;
	private float pressure;

	WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity" + pressure
				+ " pressure");
	}

	public void removeObserver() {
		weatherData.removeObserver(this);
	}

	public void registerObserver() {
		weatherData.registerObserver(this);
	}

}
