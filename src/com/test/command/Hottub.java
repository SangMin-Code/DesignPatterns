package com.test.command;

public class Hottub {
	String location;
	
	public Hottub(String location) {
		this.location = location;
	}
	public Hottub() {
		this.location = "BathRoom";
	}
	
	
	
	public void on() {
		System.out.println("Hottub is on");
	}
	public void off() {
		System.out.println("Hottub is off");
	}
}
