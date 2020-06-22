package com.test.factory;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] creaateVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}	
