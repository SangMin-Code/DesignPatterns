package com.test.command;

public class GarageDoorDowncommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorDowncommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.down();
	}

	@Override
	public void undo() {
		this.garageDoor.up();
	}
	
	

}
