package com.test.decoration;

public class SteamMilk extends CondimentDecorator{

	Beverage Beverage;
	
	public SteamMilk (Beverage beverage) {
		this.Beverage = beverage;
	}
	
	@Override
	public String getDescription() {	
		return Beverage.getDescription() + ", ���� ��ũ";		
	}

	@Override
	public double cost() {
		 return .10+Beverage.cost();
	}

}
