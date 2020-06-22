package com.test.command;

public class GarageDoorOpencommand implements Command {

	GarageDoor gragaeDoor;
	
	public GarageDoorOpencommand(GarageDoor garageDoor) {
		this.gragaeDoor = garageDoor;
	}
	@Override
	public void execute() {
		gragaeDoor.up();
	}
	@Override
	public void undo() {
		gragaeDoor.down();
	}

}
