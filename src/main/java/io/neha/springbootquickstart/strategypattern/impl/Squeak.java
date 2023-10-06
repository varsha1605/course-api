package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
