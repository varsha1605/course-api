package io.neha.springbootquickstart.factory.main;

import io.neha.springbootquickstart.factory.impl.ChicagoStylePizzaStore;
import io.neha.springbootquickstart.factory.impl.NyStylePizzaStore;
import io.neha.springbootquickstart.factory.impl.PizzaTypeEnum;
import io.neha.springbootquickstart.factory.spi.Pizza;
import io.neha.springbootquickstart.factory.spi.PizzaStore;

public class PizzaTestDrive {

	public static void main(String args[]) {
		PizzaStore pizzaStore = new NyStylePizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaTypeEnum.CHEESE_PIZZA);
		System.out.println("Varsha ordered: \n"+pizza.getName());
		
		System.out.println();
		pizzaStore = new ChicagoStylePizzaStore();
		pizza = pizzaStore.orderPizza(PizzaTypeEnum.CLAM_PIZZA);
		System.out.println("Neha ordered: "+pizza.getName());
	}
}
