package com.test.command;

public class Light {
	
	String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public Light() {
		this.name="noName";
	}
	
	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}

}
