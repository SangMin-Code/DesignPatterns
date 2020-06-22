package com.test.duck;

public class MallDuck extends Duck {
	
	public MallDuck() {
	
		quackBehavior = new Quack();
		flyBehavior = new flyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("���� �������Դϴ�.");
	}

}
