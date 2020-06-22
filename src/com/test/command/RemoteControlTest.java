package com.test.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpencommand garageOpen = new GarageDoorOpencommand(garageDoor);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
