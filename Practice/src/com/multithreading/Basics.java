package com.multithreading;

//Threads can be created by using two mechanisms : Extending the Thread class, Implementing the Runnable Interface

// Java code for thread creation by implementing the Runnable Interface
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}


//Java code for thread creation by extending the Thread class
class MultithreadingDemo2 extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class Basics {
    public static void main(String[] args)
    {
        try {
        	String ssss = "originated > '5/3/2024 7:55:18 AM'";
        	int n = 8; // Number of threads
            System.out.println("Java code for thread creation by implementing the Runnable Interface");
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                Thread object2 = new Thread(object);
                object2.start();
                object2.sleep(1000);
            }
            
            System.out.println("Java code for thread creation by extending the Thread class");
            for (int i = 0; i < n; i++) {
            	MultithreadingDemo2 object = new MultithreadingDemo2();
                object.start();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
