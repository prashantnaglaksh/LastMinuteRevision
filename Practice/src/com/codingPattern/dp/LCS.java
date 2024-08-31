// the program will return the length of longest common sub-sequence

//Longest Palindromic Subsequence we can find it by revrersing that
//particuler string and finding LCS for it

// if we want to convert a string from a to b then we do it via LCS
//first delete some char from a to make it LCS then insert some char to
// make it b ex:-geek to eka lCS is ek , geek to ek i.e 2 deletion
// and then ek to eka 1 insertion

package com.codingPattern.dp;

public class LCS {
	static String X = "abcdxwycd";
	static String Y = "xycd";
	static int m = X.length();
	static int n = Y.length();
	int[][] t = new int[m+1][n+1];
    public static void main(String[] args) {
//    	String X = "abcdxwycd";
//    	String Y = "xycd";
//    	int m = X.length();
//    	int n = Y.length();
    	
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
                    // if here we do t[i][j] = 0
                    //then we will get the length of longest common substring
                    // and return max value from matrix
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1] );
                }
            }
        }
        System.out.println(t[m][n]);
        System.out.println(getLCSRecursive(X, Y, m, n));
        System.out.println(new StringBuilder(printLCSRecursive(X, Y, m, n)).reverse());
//    below print statment will print the length of shortest common super-
// sequence
//        return m+n-t[m][n];
    }
    
    static int getLCSRecursive(String X, String Y, int m, int n) {
    	if(m == 0 || n == 0)
    		return 0;
    	if(X.charAt(m-1) == Y.charAt(n-1)) {
    		return 1 + getLCSRecursive(X, Y, m-1, n-1);
    	}else {
    		return Math.max(getLCSRecursive(X, Y, m-1, n), getLCSRecursive(X, Y, m, n-1));
    	}
    }
    

    static int getLCSMemoization(String X, String Y, int m, int n) {
    	if(m == 0 || n == 0)
    		return 0;
    	if(X.charAt(m-1) == Y.charAt(n-1)) {
    		return 1 + getLCSRecursive(X, Y, m-1, n-1);
    	}else {
    		return Math.max(getLCSRecursive(X, Y, m-1, n), getLCSRecursive(X, Y, m, n-1));
    	}
    }
    
    static String printLCSRecursive(String X, String Y, int m, int n) {
    	if(m == 0 || n == 0)
    		return "";
    	if(X.charAt(m-1) == Y.charAt(n-1)) {
    		return X.charAt(m-1) + printLCSRecursive(X, Y, m-1, n-1);
    	}else {
    		return printLCSRecursive(X, Y, m-1, n).length() > printLCSRecursive(X, Y, m, n-1).length()?printLCSRecursive(X, Y, m-1, n):printLCSRecursive(X, Y, m, n-1);
    	}
    }
}
