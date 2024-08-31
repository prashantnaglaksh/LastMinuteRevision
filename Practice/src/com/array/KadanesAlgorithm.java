package com.array;

//Largest Sum Contiguous Subarray (Kadane’s Algorithm)
public class KadanesAlgorithm {
	 public static void main(String[] args) {
		 int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		 int res = maxSubArray(nums);
		 System.out.println("i am res ::" + res);
	 }
	 
	 public static int maxSubArray(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        int sumSoFar = 0;
	        for(int i = 0; i < nums.length; i++){
	            sumSoFar = sumSoFar + nums[i];
	            max = Math.max(sumSoFar, max);
	            //reason for below check is to ensure we do not miss if single element will be max if we do not do this
	            //then max sum will be less then individual max element at that iterations
	            if(sumSoFar < 0)
	                sumSoFar = 0;
	        }
	        return max;
	    }
}
