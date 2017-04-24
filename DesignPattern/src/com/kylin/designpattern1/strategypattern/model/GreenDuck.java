package com.kylin.designpattern1.strategypattern.model;

import com.kylin.designpattern1.strategypattern.flybehavior.impl.GoodFlyBehaviorImpl;
import com.kylin.designpattern1.strategypattern.quackbehavior.impl.GegeQuackBehaviorImpl;

public class GreenDuck extends Duck {

	public GreenDuck() {
		flyBehavior = new GoodFlyBehaviorImpl();
		quackBehavior = new GegeQuackBehaviorImpl();
	}

	@Override
	public void display() {
		System.out.println("GreenDuck");
	}

}
