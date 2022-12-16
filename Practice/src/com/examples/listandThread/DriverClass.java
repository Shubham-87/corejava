package com.examples.listandThread;

public class DriverClass {

	public static void main(String[] args) throws InterruptedException {
		User user=new User(1, "User1");
		User user2=new User(2, "User2");
		User user3=new User(3, "User3");
		User user4=new User(4, "User4");
		User user5=new User(5, "User5");
		user.checkStatus();
		user2.checkStatus();
		user.register();
		user3.checkStatus();
		user3.register();
		user2.register();
		user.checkStatus();
		user4.checkStatus();
		user4.register();
		user5.register();
		user5.checkStatus();
	}

}
