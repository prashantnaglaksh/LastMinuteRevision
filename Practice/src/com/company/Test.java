package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        /*ArrayList<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(3);
        Collections.reverse(aa);
        int[] arr = new int[]{1,212,12,12};
        String[] a = new String[arr.length];
        int X = 1212;
        for(int i = 0; i < arr.length; i++){
            a[i] = String.valueOf(arr[i]);
        }
        System.out.println((a[0] + a[1]) == String.valueOf(X));*/
        int[] a = new int[]{4, 1, 8, 6, 2, 3, 10, 1, 6, 2};
        int n = a.length;
        Arrays.sort(a,0,10);
        System.out.println(Arrays.toString(a));
    }

}
