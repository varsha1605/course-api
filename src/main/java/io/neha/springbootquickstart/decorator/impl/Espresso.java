package io.neha.springbootquickstart.decorator.impl;

import io.neha.springbootquickstart.decorator.spi.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 480.96;
	}

}
