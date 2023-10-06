package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		super();
		name = "New-York style veggie pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		toppings.add("Lots of green veggies");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into 8 slices");
	}
}
