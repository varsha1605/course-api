package io.neha.springbootquickstart.strategypattern.main;

import io.neha.springbootquickstart.strategypattern.impl.Duck;
import io.neha.springbootquickstart.strategypattern.impl.FlyWithWings;
import io.neha.springbootquickstart.strategypattern.impl.Quack;
import io.neha.springbootquickstart.strategypattern.spi.FlyBehaviour;
import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class DuckSimulator {

	public static void main(String[] args) {
		// Selecting the behavior at runtime
		FlyBehaviour flyBehaviour = new FlyWithWings();
		QuackBehaviour quackBehaviour = new Quack();
		MallardDuck mallardDuck = new MallardDuck(flyBehaviour, quackBehaviour);
		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
