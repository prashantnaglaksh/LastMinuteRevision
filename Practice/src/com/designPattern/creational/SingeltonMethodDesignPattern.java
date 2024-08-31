package com.designPattern.creational;
//To create a singleton class, we must follow the steps, given below:
//1. Ensure that only one instance of the class exists.
//2. Provide global access to that instance by
//Declaring all constructors of the class to be private.
//Providing a static method that returns a reference to the instance.
//The lazy initialization concept is used to write the static methods.
//The instance is stored as a private static variable.

//The other difference is that a normal class vanishes at the end of
// the life cycle of the application while the singleton class does
// not destroy with the completion of an application.

// below way to make a SingeltonClass is not thread safe
class SingeltonClassInstance {
    private static SingeltonClassInstance single_instance = null;
    public String s;
    private SingeltonClassInstance()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static SingeltonClassInstance getInstance()
    {
        if (single_instance == null)
            single_instance = new SingeltonClassInstance();

        return single_instance;
    }
}


//Thread Synchronized Java implementation of singleton design pattern
class SingletonClassThreadSafe {
	private static SingletonClassThreadSafe obj;
	private SingletonClassThreadSafe() {}

	// Only one thread can execute this at a time
	public static synchronized SingletonClassThreadSafe getInstance()
	{
		if (obj == null)
			obj = new SingletonClassThreadSafe();
		return obj;
	}
}

/*
 * If you notice carefully once an object is created synchronization is no
 * longer useful because now obj will not be null and any sequence of operations
 * will lead to consistent results. So we will only acquire the lock on the
 * getInstance() once when the obj is null. This way we only synchronize the
 * first way through, just what we want.
 */

class SingletonClassDoubleCheckLocking {
	private static volatile SingletonClassDoubleCheckLocking obj = null;
	private  SingletonClassDoubleCheckLocking() {};
	
	private static SingletonClassDoubleCheckLocking getInstance() {
		if(obj == null) {
//		    To make thread safe
			synchronized (SingletonClassDoubleCheckLocking.class) {
//				check again as multiple threads can reach above step
				if(obj == null)
					obj = new SingletonClassDoubleCheckLocking();
			}
		}
		return obj;
	}
}



public class SingeltonMethodDesignPattern {
    public static void main(String[] args)
    {
        SingeltonClassInstance x = SingeltonClassInstance.getInstance();
        SingeltonClassInstance y = SingeltonClassInstance.getInstance();
        SingeltonClassInstance z = SingeltonClassInstance.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        if (x == y && y == z) {

            System.out.println("Three objects point to the same \n memory location on the heap \n i.e, to the same object");
        }
        else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
