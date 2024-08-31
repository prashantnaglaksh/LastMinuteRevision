//Given an array of integers Arr of size N and a number K.
// Return the maximum sum of a subarray of size K.
package com.codingPattern.slidingwindow;

public class aMaxSumSubArray {
    public static void main(String[] args) {
    	int[] arr = new int[] {100, 200, 300, 400};
        int k = 2;//window size
        int i = 0;//start of the window, using it to re do calculations
        int j = 0;//end of the window
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(j < arr.length){
            // we do the calculations here
            currentSum = currentSum + arr[j];
            //reaching to the size of window vie this if, j-i+1 is the window size at any time
            if(j-i+1 < k){
                j++;
                continue;
            }
            // window size reached now find a answer from the calculations and increase the window size and to
            // keep the window size same remove all the calculations of first element of window i.e i
            if(j-i+1 == k){
                maxSum = Math.max(currentSum, maxSum);
                currentSum = currentSum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxSum);
    }
}
