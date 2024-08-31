package com.codingPattern.dp;

/*
 * Below are the types of Knapsack problems
 * Fractional, 0/1, Unbounded KanpSack
 */

/*
 * Given N items where each item has some weight and profit associated with it and also given a bag with capacity W,
 * [i.e., the bag can hold at most W weight in it]. The task is to put the items into the bag such that the sum of profits associated 
 * with them is the maximum possible. 
 * https://www.youtube.com/watch?v=l02UxPYRmCQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=2
 * https://www.youtube.com/watch?v=fJbIuhs24zQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=4
 * https://www.youtube.com/watch?v=ntCGbPMeqgg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=5
 */
public class aKnapScak {
    public static void main(String[] args) {
        int[] val = new int[]{1,2,3,4,5,6};//value/profit array
        int[] wt = new int[]{3,8,2,1,7,4};//weight/capacity array associated to value array
        int w = 6;//capacity
        int l = val.length;
        getdp(val,wt,w,l);
    }
    
//    base condition/initialization, to find it think of smallest valid input
    static void getdp(int[] val,int[] wt, int m, int n){
        int[][] t = new int[n+1][m+1];//why size is n+1 and m+1 ?
        for(int i = 0; i<=n;i++){
            for(int j = 0; j <=m; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        
//        choice diagram
//        here j is capacity and we are finding answers if capacity is 1, 2, 3, ... and so on up to the given one
//        that is why we are checking wt[i-1] <= j
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <=m; j++){
                if(wt[i-1] <=j ){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j -wt[i-1] ],t[i-1][j] );//Max(number included, number not included)
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        for(int i = 0; i<=n;i++) {
            for (int j = 0; j <=m; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
