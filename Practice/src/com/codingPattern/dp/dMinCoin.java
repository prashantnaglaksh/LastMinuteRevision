//Given a list of coins of distinct denominations and total amount of
// money. Find the minimum number of coins required to make up that
// amount. Output -1 if that money cannot be made up using given coins.
//You may assume that there are infinite numbers of coins of each type.

/*
 * The reason you can't return -1 in the base case if (m == 0 && sum != 0) is because the algorithm relies on comparing the results 
 * of subproblems to find the minimum number of coins. Returning -1 would disrupt this comparison process because -1 is not a 
 * meaningful value in the context of finding a minimum count. Instead, you should return a value that effectively represents 
 * an infeasible solution in terms of minimizing counts, which is why Integer.MAX_VALUE - 1 is used.
 * 
 * When the recursive calls are made, they compare the results to find the minimum. If you return -1:
 * The Math.min comparison between a valid path (like 1 + some recursive call) and -1 would not work correctly 
 * because -1 could mistakenly be considered a valid minimal value, which it isn't in this context.
 */
package com.codingPattern.dp;

public class dMinCoin {
    public static void main(String[] args) {
		try {
			int[] arr = new int[] { 1, 2, 5 };
			int sum = 1001;
			System.out.println(isSubsetSum(arr, sum));
			System.out.println(isSubsetSumRecursive(arr, arr.length, sum));

		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
    static int isSubsetSum(int nums[], int amount){
        // code here
        int count = 0;
        int m = nums.length;int n = amount;
        int[][] t = new int[m+1][n+1];
        for(int i = 0; i <m+1;i++){
            for(int j = 0; j < n+1; j++){
                if(j == 0){
                    t[i][j] = 0;
                }
                if(i == 0){
                    t[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }
        for(int i = 1; i <m+1;i++){
            for(int j = 1; j < n+1; j++){
                if(nums[i-1] <= j ){
                    t[i][j] = Math.min(1 + t[i][j - nums[i-1]], t[i-1][j] );

                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[m][n] == Integer.MAX_VALUE -1?-1:t[m][n];
    }
    
    static int isSubsetSumRecursive(int nums[], int m, int sum){
    	if(m == 0 && sum != 0)
    		return Integer.MAX_VALUE - 1;//why not return -1 ?
    	if(sum == 0)
    		return 0;
    	if(nums[m-1] <= sum) {
    		return Math.min(1 + isSubsetSumRecursive(nums, m, sum - nums[m-1]), isSubsetSumRecursive(nums, m-1, sum));
    	}else {
    		return isSubsetSumRecursive(nums, m-1, sum);
    	}    	
    }
}
