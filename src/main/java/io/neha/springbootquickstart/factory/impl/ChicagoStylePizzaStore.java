package io.neha.springbootquickstart.factory.impl;

import io.neha.springbootquickstart.factory.spi.Pizza;
import io.neha.springbootquickstart.factory.spi.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		switch (type) {
			case CHEESE_PIZZA: {
				return new ChicagoStyleCheesePizza();
			}
			case CLAM_PIZZA: {
				return new ChicagoStyleClamPizza();
			}
			default:
				return null;
		}
	}

}
