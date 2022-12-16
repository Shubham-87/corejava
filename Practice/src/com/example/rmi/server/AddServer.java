package com.example.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

//Host RMI application on Server
public class AddServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		AddInterface addInterfaceImpl = new AddInterfaceImpl();

		Naming.rebind("Add", addInterfaceImpl);
		System.out.println(Naming.list("Add"));
	}

}
