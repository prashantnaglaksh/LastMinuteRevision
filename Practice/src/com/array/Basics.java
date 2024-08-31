package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = -10;
        arr[1] = 5;
        arr[2] = 0;
        arr[3] = -20;
        Arrays.sort(arr);
        System.out.println(arr[3] + 1);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> all = al;

        al.add(6);
        al.add(5);
       // al.clear();

        int[] a = new int[5];
        System.out.println("printing all" + all);
        System.out.println("printing al" + all);
        al.add(0,9);
        Collections.max(al);
        System.out.println(al.get(al.size()-1));
        System.out.println("before reverse "+al);
        Collections.reverse(al);
        System.out.println("after reverse "+al);
        
        ArrayList a1 = new ArrayList();
        List<Integer> a2 = Arrays.asList( new Integer[] { 10, 20, 30, 40 } );
        
        //it will give run time classcast exception
//        ArrayList<Integer> a3 = (ArrayList<Integer>) Arrays.asList( new Integer[] { 10, 20, 30, 40 } );
        System.out.println("a1 ::" + a1);
        System.out.println("a2 ::" + a2);
//        System.out.println("a3 ::" + a3);
        
    }
}
