package io.neha.springbootquickstart.decorator.main;

import io.neha.springbootquickstart.decorator.impl.Espresso;
import io.neha.springbootquickstart.decorator.impl.Latte;
import io.neha.springbootquickstart.decorator.impl.Mocha;
import io.neha.springbootquickstart.decorator.impl.Soy;
import io.neha.springbootquickstart.decorator.spi.Beverage;

public class CafeCoffeeDay {
	
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription()+" Rs."+beverage.cost());
		
		beverage = new Latte();
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage); 
		System.out.println(beverage.getDescription()+" Rs."+beverage.cost());
	}
	
}
