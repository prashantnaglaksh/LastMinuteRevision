package com.multithreading;



/*To create a thread in Java, you would either extend the Thread class or implement the Runnable interface.
However, starting from Java 8, you can use lambda expressions or method references to create and start threads
more concisely without explicitly implementing the Runnable interface.

When you pass a lambda expression to the Thread constructor, it implicitly implements the Runnable interface,
and the lambda body becomes the implementation of the run() method.*/
public class ThreadUisngLambda {
	public static void main(String[] args) {
//		Creating and starting a thread using lambda expression
		Thread thread = new Thread( () -> {
			System.out.println("i am lambda body");
		});
		
		thread.start();
	}
}
