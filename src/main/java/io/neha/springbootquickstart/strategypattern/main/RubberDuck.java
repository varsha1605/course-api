package io.neha.springbootquickstart.strategypattern.main;

import io.neha.springbootquickstart.strategypattern.impl.Duck;
import io.neha.springbootquickstart.strategypattern.impl.FlyNoWay;
import io.neha.springbootquickstart.strategypattern.impl.MuteQuack;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}
}
