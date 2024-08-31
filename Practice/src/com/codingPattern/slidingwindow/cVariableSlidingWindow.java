//Given an array containing N integers and an integer K.,
// Your task is to find the length of the longest Sub-Array with
// the sum of the elements equal to the given value K.
package com.codingPattern.slidingwindow;

public class cVariableSlidingWindow {
    public static void main(String[] args) {
        int[] A = new int[]{2,5,6,8,1,9,0,1,1,1,1,1,1,1};
        int N = A.length;
        int K = 7;
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while(j < N){
        	//we do the calculations here
            sum = sum + A[j];
            
            //reaching condition
            if(sum < K){
                j++;
            }else if(sum == K){
                max = Math.max(max,j-i+1);
                j++;
            }else if(sum > K){
                while(sum > K){
                    sum = sum - A[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
