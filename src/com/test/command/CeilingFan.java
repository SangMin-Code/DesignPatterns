package com.test.command;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;		
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location= location;
		speed = OFF;
			
	}
	
	public void high() {
		speed = HIGH;
		//속도를 HIGH로 맞추기 위한 코드
	}
	public void medium() {
		speed = MEDIUM;
		//속도를 HIGH로 맞추기 위한 코드
	}
	public void low() {
		speed = LOW;
		//속도를 HIGH로 맞추기 위한 코드
	}
	public void off() {
		speed = OFF;
		//속도를 HIGH로 맞추기 위한 코드
	}	
	public void on() {
		System.out.println("CeilingFan is on");
	}
	
	public int getSpeed() {
		return speed;
	}
}
