package com.test.duck;

public class MallDuck extends Duck {
	
	public MallDuck() {
	
		quackBehavior = new Quack();
		flyBehavior = new flyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 물오리입니다.");
	}

}
