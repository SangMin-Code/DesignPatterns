package com.test.factory;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		//dough = "Extra Thick Crust Dough";
		//sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
}
