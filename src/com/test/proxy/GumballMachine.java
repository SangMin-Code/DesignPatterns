package com.test.proxy;

import com.test.state.State;

public class GumballMachine implements State{
	String location;
	int count;
	State state;
	
	

	public GumballMachine(String location, int count) {
		this.location = location;
	}	

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
	
	public int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
}
