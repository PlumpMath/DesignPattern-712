package com.kylin.designpattern1.strategypattern.quackbehavior.impl;

import com.kylin.designpattern1.strategypattern.quackbehavior.QuackBehavior;

public class GagaQuackBehaviorImpl implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("GagaQuackBehaviorImpl");
	}

}
