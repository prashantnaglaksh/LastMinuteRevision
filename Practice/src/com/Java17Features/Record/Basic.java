package com.Java17Features.Record;

public class Basic {
	public static void main(String[] arg) {
		
		Employee emp = new Employee(10, "John Doe");
		
		System.out.println(emp.lName());
		System.out.println(emp.lId());
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		
		
	}
}
