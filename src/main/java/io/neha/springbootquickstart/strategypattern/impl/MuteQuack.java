package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Can't quack :( ");
	}

}
