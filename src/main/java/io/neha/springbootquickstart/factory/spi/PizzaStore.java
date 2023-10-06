package io.neha.springbootquickstart.factory.spi;

import io.neha.springbootquickstart.factory.impl.PizzaTypeEnum;

public abstract class PizzaStore {
	
	public Pizza orderPizza(PizzaTypeEnum type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(PizzaTypeEnum type);
}
