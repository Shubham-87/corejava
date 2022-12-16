package com.example.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddInterfaceImpl extends UnicastRemoteObject implements AddInterface {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	protected AddInterfaceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	  @Override public int sum(int a, int b) { 
		  // TODO Auto-generated method stub
	  return a+b;
	  
	  }
	  
	  // Using Lambda exp.
		// AddInterface addInterface=(a,b)->a+b;
}
