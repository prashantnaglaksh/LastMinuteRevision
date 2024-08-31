package com.codingPattern.dp;

import java.util.Scanner;
//Given an array arr[] of size N, check if it can be partitioned
// into two parts such that the sum of elements in both parts is
// the same.
public class cEqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,1,2,3,4,5,6,7};
        int n = arr.length;
        int res = equalPartition(arr,n);
        System.out.println(res);
    }
    static int equalPartition(int[] arr, int N)
    {
        // code here
        int sum = 0;
        for(int i = 0; i< N; i++){
            sum = sum + arr[i];
        }
        int M = sum/2;
        boolean[][] t = new boolean[N+1][M+1];
        for(int i = 0; i<=N; i++){
            for(int j = 0; j <=M; j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j <=M; j++){
                if(sum % 2 != 0){
                    t[i][j] = false;
                }else{
                    if(arr[i - 1] <= j ){
                        t[i][j] = t[i-1][j - arr[i-1] ] || t[i-1][j];
                    }else{
                        t[i][j] = t[i-1][j];
                    }
                }
            }
        }
        if(t[N][M] == false ){
            return 0;
        }
        return 1;
    }
}
