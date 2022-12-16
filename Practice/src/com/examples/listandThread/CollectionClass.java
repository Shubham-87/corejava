package com.examples.listandThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Singletone Class
public class CollectionClass  {
	
	volatile List<User> userList= new ArrayList<User>(5);
	
	public static CollectionClass collectionClass;
	
	
    private CollectionClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static CollectionClass getInstance() {
	if(collectionClass==null)
		collectionClass=new CollectionClass();
	return collectionClass;
	}
    
	public int register(User user) {
     
		userList.add(user);
		return userList.indexOf(user);
	}

	public void checkStatus() {
		userList.forEach((usr)->{System.out.printf("%d - %s\n",usr.getId(),usr.getName());});
	    //System.out.println(userList);
	}
}
