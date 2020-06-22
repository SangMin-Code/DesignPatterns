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
		//�ӵ��� HIGH�� ���߱� ���� �ڵ�
	}
	public void medium() {
		speed = MEDIUM;
		//�ӵ��� HIGH�� ���߱� ���� �ڵ�
	}
	public void low() {
		speed = LOW;
		//�ӵ��� HIGH�� ���߱� ���� �ڵ�
	}
	public void off() {
		speed = OFF;
		//�ӵ��� HIGH�� ���߱� ���� �ڵ�
	}	
	public void on() {
		System.out.println("CeilingFan is on");
	}
	
	public int getSpeed() {
		return speed;
	}
}
