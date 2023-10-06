package io.neha.springbootquickstart.decorator.impl;

import io.neha.springbootquickstart.decorator.spi.Beverage;
import io.neha.springbootquickstart.decorator.spi.Toppings;

public class Soy extends Toppings {

	Beverage beverage;
	double price;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		price = 100;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + price;
	}

}
