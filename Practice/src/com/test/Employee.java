package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Employee {
	int id;
	String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}

class dummy{
	public static void main(String[] args) {
		Set<Employee> q = new HashSet<>();
		q.add(new Employee(1, "Doe"));
		q.add(new Employee(2, "Doe"));
		q.add(new Employee(1, "John"));
		
		Iterator<Employee> it = q.iterator();
		while(it.hasNext()) {
			Employee e  = it.next();
			System.out.println(e.id + " " + e.name);
		}
	}
}
