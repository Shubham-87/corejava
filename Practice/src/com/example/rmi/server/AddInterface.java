package com.example.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
//Skeleton
//RMI Server Interface for client
public interface AddInterface extends Remote {

  int sum(int a, int b) throws RemoteException;
  
}
