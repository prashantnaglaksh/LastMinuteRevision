//Given an array arr of size n and an integer X.
// Find if there's a triplet in the array which sums up to the
// given integer X.
package com.array;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,45,6,10,8};
        System.out.println(find3Numbers(arr,arr.length,13));
    }
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for(int i = 0; i<n -1;i++){
            int a = i+1;
            int b = n-1;
            while(a<b){
                if(A[i] + A[a] + A[b] == X){
                    return true;
                }else if(A[i] + A[a]+ A[b] > X){
                    b--;
                }else{
                    a++;
                }
            }
        }
        return false;
    }
}
