/*
 * Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
 */
package com.codingPattern.dp;

public class bSubsetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3,34,4,12,5,2};
        System.out.println(isSubsetSum(6,arr,111));
        System.out.println(isSubsetSumRecursive(6,arr,111));
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] t = new boolean[N+1][sum+1];
        for(int i = 0; i <=N; i++){
            for(int j = 0; j <=sum; j++){
                if(i==0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }
        for(int i = 1; i <=N; i++){
            for(int j = 1; j <=sum; j++){
                if(arr[i-1] <= j){
                    t[i][j] =  t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[N][sum];
    }
    
    static boolean isSubsetSumRecursive(int n, int arr[], int sum) {
    	if(sum == 0)
    		return true;
    	
    	if(n == 0)
    		return false;
    	
    	if(arr[n - 1] <= sum) {
    		return isSubsetSumRecursive(n-1, arr, sum - arr[n-1]) || isSubsetSumRecursive(n-1, arr, sum);
    	}else {
    		return isSubsetSumRecursive(n-1, arr, sum);
    	}
    	
    }
}
