package com.test.singletone;

public class singletone {
	
	private static singletone uniqueInstance;
	
	private singletone() {}
	
	public static singletone getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new singletone();
			
		}
		return uniqueInstance;
	}
}
