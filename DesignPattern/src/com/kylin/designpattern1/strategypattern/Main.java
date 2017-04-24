package com.kylin.designpattern1.strategypattern;

import com.kylin.designpattern1.strategypattern.flybehavior.impl.NoFlyBehaviorImpl;
import com.kylin.designpattern1.strategypattern.model.Duck;
import com.kylin.designpattern1.strategypattern.model.GreenDuck;
import com.kylin.designpattern1.strategypattern.model.RedDuck;
import com.kylin.designpattern1.strategypattern.quackbehavior.impl.HahaQuackBehaviorImpl;

public class Main {
	public static void main(String[] args) {
		Duck greenDuck = new GreenDuck();
		Duck redDuck = new RedDuck();

		greenDuck.display();
		greenDuck.swim();
		greenDuck.fly();
		greenDuck.quack();

		System.out.println("-----------");

		redDuck.display();
		redDuck.swim();
		redDuck.fly();
		redDuck.quack();

		System.out.println("-----------");

		greenDuck.setFlyBehavior(new NoFlyBehaviorImpl());
		greenDuck.fly();

		redDuck.setQuackBehavior(new HahaQuackBehaviorImpl());
		redDuck.quack();
	}
}
