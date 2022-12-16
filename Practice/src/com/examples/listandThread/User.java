package com.examples.listandThread;

public class User {
private int id;
private String name;


public User(int id,String name) {
	this.name=name;
	this.id=id;
}

public void register() throws InterruptedException {
	
	ListWriter listWriter=new ListWriter(this);
	listWriter.start();
	listWriter.join();
	
}

public void checkStatus() throws InterruptedException {
    System.out.println("Checking status for user="+id);
	ListReader listReader=new ListReader();
	listReader.start();
	listReader.join();
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}



}
