package com.test.duck;

public class Modelduck extends Duck{

	public Modelduck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}

}
