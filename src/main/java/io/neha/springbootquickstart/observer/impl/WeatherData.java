package io.neha.springbootquickstart.observer.impl;

import java.util.ArrayList;
import java.util.List;

import io.neha.springbootquickstart.observer.spi.Observer;

public class WeatherData {

	List<Observer> observers;
	float temperature;
	float humidity;
	float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void measurmentsChanged() {
		notifyObservers();
	}

	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update();
		}
	}
	
	public void setWeatherData(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurmentsChanged();
	}
}
