package com.test.iteratorandcomposite;

import java.util.Iterator;

public class Waitress {
	
	/*
	 * MenuIterator pancakeHouseMenu; MenuIterator dinerMenu; MenuIterator cafeMenu;
	 * 
	 * public Waitress(MenuIterator pancakeHouseMenu, MenuIterator dinerMenu,
	 * MenuIterator cafeMenu) { this.pancakeHouseMenu = pancakeHouseMenu;
	 * this.dinerMenu = dinerMenu; this.cafeMenu = cafeMenu; }
	 * 
	 * public void printMenu() { Iterator pancakeIterator =
	 * pancakeHouseMenu.createIterator(); Iterator dinerIterator =
	 * dinerMenu.createIterator(); Iterator cafeIterator =
	 * cafeMenu.createIterator(); System.out.println("메뉴\n---\n아침메뉴");
	 * printMenu(pancakeIterator); System.out.println("메뉴\n---\n점심메뉴");
	 * printMenu(dinerIterator); System.out.println("메뉴\n---\n점심메뉴");
	 * printMenu(cafeIterator);
	 * 
	 * }
	 * 
	 * private void printMenu(Iterator iterator) { while(iterator.hasNext()) {
	 * MenuItem menuItem = (MenuItem)iterator.next();
	 * System.out.print(menuItem.getName() + ",");
	 * System.out.print(menuItem.getPrice() + "--");
	 * System.out.println(menuItem.getDescription()); } }
	 */
	
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\n VEGETARAIAN MENU\n--");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}catch(UnsupportedOperationException e) {
				
			}
		}
	}
}
