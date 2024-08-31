// iterating a hashMap and a hashSet
package com.mapandset;
import java.util.*;
import java.util.Scanner;

public class MapAndSetIterate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //below code is printitng elements with their count
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();
        mp2.put('k',1);mp2.put('b',2);mp2.put('j',1);mp2.put('h',1);
        System.out.println("enter a string");
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c) + 1);
            }else{
                mp.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println(mp.equals(mp2));
        System.out.println(mp.keySet().equals(mp2.keySet()));
        // below code is pritig the unique element
       HashSet<Character> hs = new HashSet<>();
       System.out.println("enter a string");
       String ss = sc.nextLine();
       char[] array = ss.toCharArray();
       for(char c : ss.toCharArray()){
           hs.add(c);
       }
       Iterator it = hs.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}