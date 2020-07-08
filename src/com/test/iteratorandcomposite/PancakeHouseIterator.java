package com.test.iteratorandcomposite;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator1{
	
	ArrayList menuItems;
	int position;
	
	public PancakeHouseIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position>= menuItems.size()) {
			return false;
		}else {
			return true;
		}		
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem)menuItems.get(position);
		position = position+1;
		return menuItem;
	}

}
