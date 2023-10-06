package io.neha.springbootquickstart.strategypattern.impl;

import io.neha.springbootquickstart.strategypattern.spi.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I am flying with wings");
	}

}
