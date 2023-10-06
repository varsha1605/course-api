package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		super();
		name = "New-York style cheese pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		toppings.add("Grated Raggiano cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into 8 slices");
	}
}
