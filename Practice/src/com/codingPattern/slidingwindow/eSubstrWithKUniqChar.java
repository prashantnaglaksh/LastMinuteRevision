//Given a string you need to print the size of the longest possible
// substring that has exactly K unique characters. If there is no
// possible substring then print -1.
package com.codingPattern.slidingwindow;

import java.util.HashMap;

public class eSubstrWithKUniqChar {
    public static void main(String[] args) {
        String s = "aabecde";
        int i = 0; int j = 0;int k = 3;int max = 0;
        int n = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        while(j < n){
            //calculatons
            if(hm.containsKey(s.charAt(j) ) ){
                hm.put(s.charAt(j), hm.get(s.charAt(j)) + 1 );
            }else{
                hm.put(s.charAt(j),1 );
            }
            //checking condition
            if(hm.size() < k ){
                j++;
            }
            // getting answers
            else if(hm.size() == k ){
                max = Math.max(max,j-i+1 );
                j++;
            }
            //sliding the window and removing the calculations
            //of i
            else if(hm.size() > k ){
                while(hm.size() > k ){
                    hm.put(s.charAt(i),hm.get(s.charAt(i) ) - 1 );
                    if(hm.get(s.charAt(i)) == 0 ){
                        hm.remove(s.charAt(i) );
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max == 0?-1:max);
    }
}
