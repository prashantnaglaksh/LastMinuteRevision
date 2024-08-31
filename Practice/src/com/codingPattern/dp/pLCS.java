// prog to print lcs
package com.codingPattern.dp;

import java.util.Arrays;

public class pLCS {
    public static void main(String[] args) {

            String X = "abcdxwycd";
            String Y = "xycd";
            int m = X.length();
            int n = Y.length();
            int[][] t = new int[m+1][n+1];
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
                    }else{
                        t[i][j] = Math.max(t[i-1][j],t[i][j-1] );
                    }
                }
            }
            
            System.out.println("i am t :: " + Arrays.deepToString(t));
            for (int[] row : t) {
                System.out.println(Arrays.toString(row));
            }
            
            StringBuffer sb = new StringBuffer();
            int i = m, j = n;
            while(i > 0 && j > 0){
                if(X.charAt(i - 1) == Y.charAt(j - 1) ){
                    sb.append(X.charAt(i-1));
                    i--;j--;
                }else if(t[i-1][j] > t[i][j-1] ){
                    i--;
                }else{
                    j--;
                }
            }
        System.out.println(sb.reverse());
    }
}
