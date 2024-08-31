package com.company;

// Java program to demonstrate BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadingInputUsingBuffer {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(s);
        int n = s.length();
        String sss = "4 5 6";
        int a = 10203;
        String[] ss = sss.split(" ");
        System.out.println(Arrays.toString(ss));
        int[][] arr = new int[n][];
        arr[0] = new int[]{1, 2, 2};

    }
}

