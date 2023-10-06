package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack, Quack!!");
	}

	// QuackBehaviour quack = new Quack();

}
