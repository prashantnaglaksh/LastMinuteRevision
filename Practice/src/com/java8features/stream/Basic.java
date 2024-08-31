package com.java8features.stream;

import java.io.*; 
import java.util.*;
import java.util.function.Function;
import java.util.stream.*; 

//Main class 
public class Basic { 
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(2); 
		al.add(6); 
		al.add(9); 
		al.add(4); 
		al.add(20);
		System.out.println("Printing the collection : "+ al);
		// Stream operations 
		// 1. Getting the stream from this collection 
		// 2. Filtering out only even elements 
		// 3. Collecting the required elements to List 
		List<Integer> ls = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Printing the List after stream filter operation : " + ls); 
		
		List<Integer> ls2 = al.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("Printing the List after stream map operation : " + ls2); 
		
		List<Integer> ls3 = al.stream().sorted().collect(Collectors.toList());
		List<Integer> ls4 = al.stream().sorted( (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0 ).collect(Collectors.toList());
		System.out.println("Printing the List after stream sorted operation : " + ls3); 
		System.out.println("Printing the List after stream sorted operation : " + ls4);
		
		List<Integer> ls5 = al.stream().filter(i -> i % 2 == 0).map(i -> i + 2).sorted().collect(Collectors.toList());
		System.out.println("Printing the List after stream pipeline filter, sorted and map operation : " + ls5);
		
//		we can use var from JDK 10
		var x = List.of(1, 2, 3).stream().reduce(0, (i, j) -> i+j);
		System.out.println("Printing the List after stream reduce operation : " + x);
		
		
//		convert an arraylist to hashmap use string length in value and object itself as key
		 ArrayList<String> ls6 = new ArrayList<>(); 
		 ls6.add("Banana"); 
		 ls6.add("Guava"); 
		 ls6.add("Pineapple"); 
		 ls6.add("Apple");
//		 ls6.add("Apple");
	     
		 Map<String, Integer> map  = ls6.stream().collect(Collectors.toMap(o1-> o1, String::length));
		 Map<String, Integer> map2  = ls6.stream().collect(Collectors.toMap(Function.identity(), String::length));
		 System.out.println("i am map ::" + map);
		 System.out.println("i am map2 ::" + map2);
		 
		 
//		 use below way to convert a list to map as above 2 will give error when list have 2 duplicate key
	     HashMap<String, Integer> hm  = ls6.stream().collect(Collectors.toMap(Function.identity(), String::length, 
	    		 (e1, e2)-> e1,  HashMap::new));
	     System.out.println("i am hashmap ::" + hm);
	     
			/*
			 * Function.identity(): This represents a mapping function that returns the
			 * input element itself. In other words, it means each element in the stream
			 * will be used as the key in the resulting map.
			 * 
			 * String::length: This represents a mapping function that calculates the length
			 * of the input string. It means that the value associated with each key in the
			 * resulting map will be the length of the corresponding string.
			 * 
			 * (e1, e2) -> e1: This is a merge function that resolves conflicts when two
			 * elements in the stream produce the same key. In this case, it specifies that
			 * the value associated with the key should be the first encountered value (e1)
			 * for that key. HashMap::new: This specifies the type of map to be created. In
			 * this case, it creates a new HashMap to store the mapping results.
			 */
	     
	}
}
