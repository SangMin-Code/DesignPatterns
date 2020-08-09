package com.test.proxy;

import java.rmi.*;
import java.rmi.server.*;


public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	String location;
	int count;
	State state;
	
	

	public GumballMachine(String location, int count) throws RemoteException{
		this.location = location;
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
