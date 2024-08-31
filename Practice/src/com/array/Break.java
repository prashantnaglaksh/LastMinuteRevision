package com.array;

import java.util.ArrayList;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5, s= 12;
        int[] arr = new int[]{1,2,3,7,5};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i< n; i++){
            int j = i+ 1;
            System.out.println("in for "+i);
            sum = sum + arr[i];
            while(j< n){
                System.out.println(j);
                if(sum < s){
                    sum = sum + arr[j];
                    j++;
                }else if(sum == s){
                    al.add(i+1);
                    al.add(j+1);
                    System.out.println(al);
                    return;
                }else{
                    sum = 0;
                    System.out.println("sum " + sum);
                    break;
                }

            }
        }
    }
}
