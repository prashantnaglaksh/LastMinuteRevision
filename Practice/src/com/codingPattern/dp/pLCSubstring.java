// prog to print lc Substring
package com.codingPattern.dp;

public class pLCSubstring {
    public static void main(String[] args) {

        String X = "abcdxycd";
        String Y = "xycd";
        int m = X.length();
        int n = Y.length();
        int[][] t = new int[m+1][n+1];
        int row = 0, col = 0;
        int len  = Integer.MIN_VALUE;
        // we will be storing the index of lc substr in row and col
        // as it is not always that we will find lc substr at the
        // last element in matri i.e, t[m][n]
        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(X.charAt(i-1) == Y.charAt(j-1) ){
                    t[i][j] = 1 + t[i-1][j-1];
                    if(len <t[i][j] ){
                        row = i;
                        col = j;
                        len = Math.max(len, t[i][j]);
                    }
                }else{
                    t[i][j] = 0;
                }
            }
        }
        StringBuffer sb = new StringBuffer();

        while(t[row][col] != 0 ){
            sb.append(X.charAt(row - 1) );
            row--;col--;
        }
        System.out.println(sb.reverse());
    }
}
