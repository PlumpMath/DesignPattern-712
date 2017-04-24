package com.kylin.designpattern1.strategypattern.quackbehavior.impl;

import com.kylin.designpattern1.strategypattern.quackbehavior.QuackBehavior;

public class GegeQuackBehaviorImpl implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("GegeQuackBehavior");
	}

}
