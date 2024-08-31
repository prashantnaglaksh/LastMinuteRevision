package com.company;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Basic {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        int[] b = new int[]{1,9,3,4,5};
        a.add(5);
        a.add(1);
        a.add(25);
        a.add(0);
        Collections.sort(a);
        System.out.println(a.contains(25));
        System.out.println(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

    }
}
