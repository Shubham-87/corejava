package com.utility;

public class ShutDownHook extends Thread{


@Override
	public void run() {
	System.out.println("Application closed");
	}
}
