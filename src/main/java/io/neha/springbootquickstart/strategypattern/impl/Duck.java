package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.FlyBehaviour;
import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
}
