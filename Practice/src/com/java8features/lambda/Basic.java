package com.java8features.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {
	public static void main(String[] arg) {
		
//		lambda expression to implement above functional interface. This interface
//      by default implements abstractMethod()
		MyInterface add = (int x, int y) -> {
			return x + y;
		};
		
		MyInterface multiply = (int x, int y) -> {
			return x * y;
		};
		System.out.println("i am add.abstractMethod ::" + add.abstractMethod(5, 5));
		add.normalFun();
		
		System.out.println("i am multiply.abstractMethod ::" + multiply.abstractMethod(5, 5));
		multiply.normalFun();
		
		
//		lambda with collections
		ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(100);
        arrL.add(111);
        arrL.add(27);
        arrL.add(3);
        arrL.add(5);
        
        arrL.forEach(n -> {
        	System.out.println(" i am i inside for each ::" + n);
        });
        
        System.out.println("before sort ::" + arrL);
        
        Collections.sort(arrL);
        System.out.println("after sort ::" + arrL);

        Collections.sort(arrL, (o1, o2) -> {
        	return (o1 > o2) ? -1 : (o1 < o2) ? 1: 0;
        });
        
        // using lambda expression in place of comparator object
        Collections.sort(arrL, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("after sort using lamda::" + arrL);
        
        
		
	}
}


// functional interface
interface MyInterface{
//	An abstract function
	int abstractMethod(int x, int y);
	
//	A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}

