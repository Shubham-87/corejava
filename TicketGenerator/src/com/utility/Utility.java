package com.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.model.User;

public class Utility {
	private static Logger logger=Logger.getLogger(Utility.class.getName());
	public static List<Integer> addInput() throws IOException{
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		String input[]=bufferedReader.readLine().split("\s");
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		for (String string : input) {
			arrayList.add(Integer.parseInt(string));
		}
		
		return arrayList;
	}
	
	public static Map<Integer, List<Integer>> checkInputMatch(int [][] tiket, List<Integer> input) {
		int matchCount=0;
		
		List<int[]> list=Arrays.asList(tiket);
		Map<Integer, List<Integer>> map=new LinkedHashMap<Integer, List<Integer>>();
		Iterator<int[]> iterator=list.iterator();
	    int layer=1;
	    for (int[] is : list) {
	    	List<Integer> matchedNOs=new ArrayList<Integer>();
			
	    	for (int is2 : is) {
				
				 if(input.contains(is2)) {
					 matchCount++;
					// System.out.printf("No Found=%d at Layer=%d MatchCount=%d\n",is2,layer,matchCount);
				     matchedNOs.add(is2);
				     map.put(layer, matchedNOs);
				 }
					 
			}
			layer++;
		}
		
		System.out.println("Input Matches:\n"+map);
		
		return map;
	}
	
	
	//Random No Generator
	public static int generateRandomNumber(int max ,int min) {
		   return (int) (Math.random() * (max - min + 1) + min);
	 }
	
	public static User createNewUser() throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name=bufferedReader.readLine();
		System.out.println("Enter your Password");
		String password=bufferedReader.readLine();
		User user=new User(name,password);
		return user;
		
	}
}
