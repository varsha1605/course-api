package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;

public class ChicagoStyleClamPizza extends Pizza{

	public ChicagoStyleClamPizza() {
		super();
		name = "Chicago style clam pizza";
		dough = "Extra thin crust dough";
		sauce = "Plum tomato sauce";
		toppings.add("Fresh clams");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into 4 slices");		
	}

}
