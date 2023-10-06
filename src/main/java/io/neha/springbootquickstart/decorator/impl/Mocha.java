package io.neha.springbootquickstart.decorator.impl;

import io.neha.springbootquickstart.decorator.spi.Beverage;
import io.neha.springbootquickstart.decorator.spi.Toppings;

public class Mocha extends Toppings {

	Beverage beverage;
	double price;

	public Mocha(Beverage beverage) {
		price = 70;
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost()+price;
	}

}
