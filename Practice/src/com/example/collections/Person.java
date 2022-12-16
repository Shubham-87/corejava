package com.example.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class Person implements Comparable<Person>  {

	String name;
	int id;
	
	public Person(int id, String name) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}
	
	
	
	@Override
	public String toString() {
		return name+" : "+id;
	}

	public static void main(String[] args) {
		
		List<Person> list=new LinkedList<Person>();
		list.add(new Person(1, "Gita"));
		list.add(new Person(2, "Rahul"));
		list.add(new Person(3, "Nikhil"));
		list.add(new Person(4, "Aman"));
		System.out.println(list);
		//Sort using Comparable
		Collections.sort(list);
		System.out.println(list);
		//Sort using Comparator
		Collections.sort(list, new PersonComparator());
		System.out.println(list);
		
		//Sort Treeset using Comparator
		TreeSet< Person> ts = new TreeSet< Person>(new PersonComparator());
	    ts.add(new Person(45, "Rahul"));
	    ts.add(new Person(50, "Adam"));
	    ts.add(new Person(19, "Alex"));
		System.out.println(ts);
		
		
	}



}
