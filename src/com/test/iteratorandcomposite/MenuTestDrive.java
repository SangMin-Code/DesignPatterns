package com.test.iteratorandcomposite;

public class MenuTestDrive {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DineMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
