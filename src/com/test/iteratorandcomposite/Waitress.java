package com.test.iteratorandcomposite;

import java.util.Iterator;

public class Waitress {
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
		
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();
		System.out.println("메뉴\n---\n아침메뉴");
		printMenu(pancakeIterator);
		System.out.println("메뉴\n---\n점심메뉴");
		printMenu(dinerIterator);
		System.out.println("메뉴\n---\n점심메뉴");
		printMenu(cafeIterator);
		
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ",");
			System.out.print(menuItem.getPrice() + "--");
			System.out.println(menuItem.getDescription());
		}
	}

}
