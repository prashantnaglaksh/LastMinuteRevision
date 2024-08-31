package com.company;

import java.util.HashMap;
import java.util.Scanner;
// program to find first non repeating char in a string
public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string  -:");
        String myString = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (char c : myString.toCharArray()){
            if (!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            }else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        for (char c : myString.toCharArray()){
            if (hashMap.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }
}