package com.test.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.ordderPizza("cheese");
		System.out.println("Ethan ordered a "+ pizza.getNane()+"\n");

		pizza = chicagoStore.ordderPizza("cheese");
		System.out.println("Joel ordered a "+ pizza.getNane()+"\n");
	}
}
