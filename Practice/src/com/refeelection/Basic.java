package com.refeelection;
import java.lang.reflect.*;

public class Basic {
	public static void main(String[] arg) {
		try {
			Class c = Class.forName("com.refeelection.Person");
			System.out.println("i am c package name ::" + c.getPackageName());
			
			Constructor[] constructorArr  = c.getConstructors();
			
			for(Constructor constr : constructorArr) {
				System.out.println("i am const ::" + constr);
				System.out.println("i am const.getName ::" + constr.getName());
				
				Parameter[] parameter = constr.getParameters();
				for(Parameter par : parameter) {
					System.out.println("i am par ::" + par);
				}
			}
			
			
			
			
			Object person = new Person();
//			below both are equalent
//			Field[] filedArr = c.getDeclaredFields();
			Field[] filedArr = person.getClass().getDeclaredFields();
			
			for(Field field : filedArr) {
				System.out.println("i am field ::" + field.getName());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}