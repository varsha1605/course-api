package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		super();
		dough = "Extra thin crust dough";
		sauce = "Plum tomato sauce";
		toppings.add("Shredded mozarella cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into 4 slices");
	}
}
