package com.test.command;

public class Stereo {
	
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public Stereo() {
		this.name = "noName";
	}
	
	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCd() {
		System.out.println("CD is set");
	}
	
	public void setVolume(int num) {
		System.out.println("Stereo volume is "+num);
	}
}
