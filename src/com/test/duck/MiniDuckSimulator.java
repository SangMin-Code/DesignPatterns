package com.test.duck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model  = new Modelduck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
