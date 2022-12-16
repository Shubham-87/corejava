package com.examples.listandThread;

public class ListReader extends Thread {

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		CollectionClass collectionClass=CollectionClass.getInstance();
		
		synchronized (collectionClass) {
			collectionClass.checkStatus();	
		}
		
	}
}
