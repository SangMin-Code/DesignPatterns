package com.test.factory;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = " NY Style Sauce and cheese Pizza";
		//dough = " This Crust Dough";
		//sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
}
