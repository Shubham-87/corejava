package com.examples.listandThread;


public class ListWriter extends Thread{

	User user;
	
	public ListWriter(User user) {
		this.user=user;
	}
	
	@Override
	public void run() {
		CollectionClass collectionClass=CollectionClass.getInstance();
		System.out.println("Adding user="+user.getId());
		synchronized (collectionClass) {
			int id=collectionClass.register(user);
			System.out.printf("%s is added at postion=%d\n",user.getName(),id);
	
		}
	}
}
