package com.test.iteratorandcomposite;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuiterator implements Iterator {
	
	MenuItem[] items;
	int position;
	
	public AlternatingDinerMenuiterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position =rightNow.DAY_OF_WEEK%2;
	}
	

	@Override
	public boolean hasNext() {
		if(position>=items.length||items[position]==null) {
			return false;
		}else {
			return true;		
		}
	}	

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position +2;
		return menuItem;
		
	} 
	
	public void remove() {
		throw new UnsupportedOperationException("remove()는 지원하지 않습니다.");
	}

	
	
	
}
