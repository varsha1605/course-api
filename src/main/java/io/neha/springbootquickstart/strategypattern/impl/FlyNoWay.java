package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
