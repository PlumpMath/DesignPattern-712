package com.kylin.designpattern1.strategypattern.flybehavior.impl;

import com.kylin.designpattern1.strategypattern.flybehavior.FlyBehavior;

public class BadFlyBehaviorImpl implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("BadFlyBehaviorImpl");
	}

}
