// it will find the longest substring with unique chars
package com.codingPattern.slidingwindow;

import java.util.ArrayList;

public class dSubstrWithUniqueChar {
    public static void main(String[] args) {
        String S = "ascsadvae";
        ArrayList<Character> al = new ArrayList<>();
        int i= 0, j = 0, max = 0;
        while(j < S.length() ){
            System.out.println(al);
            if(al.contains(S.charAt(j) ) ){
                al.remove(0 );
                i++;
            }else{
                al.add(S.charAt(j) );
                max = Math.max(max, al.size());
                j++;
            }
        }
        System.out.println(max);
    }
}
