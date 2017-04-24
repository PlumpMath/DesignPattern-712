package com.kylin.designpattern1.strategypattern.model;

import com.kylin.designpattern1.strategypattern.flybehavior.impl.BadFlyBehaviorImpl;
import com.kylin.designpattern1.strategypattern.quackbehavior.impl.GagaQuackBehaviorImpl;

public class RedDuck extends Duck {

	public RedDuck() {
		flyBehavior = new BadFlyBehaviorImpl();
		quackBehavior = new GagaQuackBehaviorImpl();
	}

	@Override
	public void display() {
		System.out.println("RedDuck");
	}

}
