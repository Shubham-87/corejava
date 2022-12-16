package com.example.collections;


import java.util.*; 

public class AbstractListDemo1 { 
    public static void main(String args[]) 
    { 
AbstractList list = new LinkedList(); 
list.add("Dog"); 
list.add("Cat"); 
list.add("Bird"); 
list.add("Tiger"); 
list.add("Rabit"); 

	System.out.println("***********************************");
System.out.println("Elements in the List 1:" + list);

	list.add(3, "Deer"); 
	System.out.println("***********************************************************"); 
System.out.println("After Adding Deer at position 3");

	System.out.println("Elements in the List 1:" + list); //New List
	System.out.println("***********************************************************");
	AbstractList list1 = new LinkedList();
	list1.add("Dog"); 
        list1.add("Cat"); 
        list1.add("Bird"); 
        list1.add("Tiger"); 
        list1.add("Rabit"); 
	System.out.println("***********************************************************");
System.out.println("Elements in the List 2 :" + list1); //New List2
	System.out.println("***********************************************************");
	boolean ab = list.equals(list1); 
	System.out.println("Are both list equal : "+ ab); 
	System.out.println("***********************************************************");	
	String bc = (String) list1.get(3);
	System.out.println("Get element of index 3 : "+bc);
	System.out.println("***********************************************************");
	int cd= list.hashCode();
System.out.println("HashCode : " + cd); 
	System.out.println("***********************************************************");
	int de= list.indexOf("Bird"); 
	System.out.println("index of Bird in List 1: " + de); 
	System.out.println("***********************************************************");
	Iterator ef = list.iterator(); 
            while (ef.hasNext()) 
		{ 
System.out.println("Element : "+ ef.next()); 
		}
	System.out.println("***********************************************************");
	int fg= list.lastIndexOf("Rabit"); 
	System.out.println("Last index of Rabit : "+ fg); 
	System.out.println("***********************************************************");
	ListIterator gh = list.listIterator(3); 
System.out.println("The list is as follows:"); 
        while (gh.hasNext()) { 
System.out.println(gh.next()); 
        } 
	System.out.println("***********************************************************");
    } 
}
	