package com.mapandset;

import java.util.TreeSet;

public class TreeSetInmp {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(14);
        ts.add(0);
        ts.add(7);
        System.out.println(ts);
        System.out.println("digit higher than 12  is " + ts.higher(12));
        System.out.println("digit lower than 12 is " + ts.lower(12));
        System.out.println("floor of 12 "  + ts.floor(12));
        System.out.println("ceiling of 12  " + ts.ceiling(12));
        System.out.println("floor of 11 "  + ts.floor(11));
        System.out.println("ceiling of 11  " + ts.ceiling(11));

    }
}
