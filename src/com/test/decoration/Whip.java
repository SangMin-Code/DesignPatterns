package com.test.decoration;

public class Whip extends CondimentDecorator {
	
	Beverage Beverage;
	
	public Whip(Beverage beverage) {
		this.Beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return Beverage.getDescription()+", ���� ũ��";
	}

	@Override
	public double cost() {
		return .10+Beverage.cost();
	}

}
