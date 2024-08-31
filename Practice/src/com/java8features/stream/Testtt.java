package com.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Testtt {
	public static void main(String[] args) {
		int vv = 9_9;
//		public int = 8; // not allowd wwil give compilation error only final is allowed
		String Integer = "ss";
		Integer String = 3;
		System.out.println(Integer + " == " + String);
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(2);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(20);
		System.out.println("Printing the collection : "+ al);
		
		List<Integer> collect = al.stream().map(i -> i*2).filter(i  -> i % 2 == 0)
				.peek(i -> System.out.println("i am from peek ::" + i)).collect(Collectors.toList());
		System.out.println("i am collect ::" + collect);
		
		Optional<Integer> reduce = Optional.ofNullable(al.stream().reduce(9, (i,j) -> i+j));
		System.out.println("i am reduce ::" + reduce);
		
		var reduceVar = al.stream().reduce(9, (i,j) -> i+j);
		System.out.println("i am reduceVar ::" + reduceVar);
		
		Optional<Integer> sumOfEvenNumbers = al.stream().map(i->i*2).filter(i->i%2==0).reduce((i,j)->i+j);
		System.out.println("i am sumOfEvenNumbers ::" + sumOfEvenNumbers.get());
		
		Optional<Integer> reduce2 = al.stream().reduce( (i,j)  ->  i>j?i:j);
		System.out.println("i am maximum number ::" + reduce2.get());
		
		al.stream().forEach(System.out :: println);
		
		OptionalInt max = al.stream().mapToInt(i -> i).max();
		System.out.println(max);
		
		
	}
}
