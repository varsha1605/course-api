package io.neha.springbootquickstart.strategypattern.main;

import io.neha.springbootquickstart.strategypattern.impl.Duck;
import io.neha.springbootquickstart.strategypattern.spi.FlyBehaviour;
import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class MallardDuck extends Duck {

	public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}
}
