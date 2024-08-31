//Given an array A[] of size N and a positive integer K,
// find the first negative integer for each and every
// window(contiguous subarray) of size K.

package com.codingPattern.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bFirstNegative {
    public static void main(String[] args) {
        long[] A = new long[]{-8, 2, 3, -89, 4};
        int N = A.length;
        int K = 3;
        long[] arr = new long[N - K + 1];
        ArrayList<Long> al = new ArrayList<>();
        int p = 0;
        int i = 0;
        int j = 0;
        while(j < N){
            if(A[j] < 0){
                al.add(A[j]);
            }
            if(j-i+1 < K){
                j++;
                continue;
            }
            if(j-i+1 == K){
                if(al.size() == 0){
                    arr[p] = 0;
                }else{
                    arr[p] = al.get(0);
                    if(A[i] ==  al.get(0) ){
                        al.remove(0);
                    }
                }
                p++;i++;j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
