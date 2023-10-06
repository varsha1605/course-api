package io.neha.springbootquickstart.decorator.impl;

import io.neha.springbootquickstart.decorator.spi.Beverage;

public class Latte extends Beverage {

	public Latte() {
		description = "Latte ";
	}

	@Override
	public double cost() {
		return 510.65;
	}

}
