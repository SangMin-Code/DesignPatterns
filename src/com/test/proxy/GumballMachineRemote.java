package com.test.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.test.proxy.State;

public interface GumballMachineRemote extends Remote {
	
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
