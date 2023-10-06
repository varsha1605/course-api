package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;
import io.neha.springbootquickstart.factory.spi.PizzaStore;

public class NyStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		switch (type) {
			case CHEESE_PIZZA: {
				return new NYStyleCheesePizza();
			}
			case VEGGIE_PIZZA: {
				return new NYStyleVeggiePizza();
			}
			default:
				return null;
		}
	}
}
