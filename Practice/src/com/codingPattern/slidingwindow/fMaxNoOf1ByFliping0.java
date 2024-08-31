// find the max no of consicutive 1's by flipping atmost m zeroes
package com.codingPattern.slidingwindow;

public class fMaxNoOf1ByFliping0 {
    public static void main(String[] args) {
        System.out.println(findZeroes(new int[]{1,0,1}, 3, 2));
    }
    static int findZeroes(int arr[], int n, int m) {
        // code here
        int i = 0; int j = 0; int c = 0; int zc = 0; int cmax = 0;
        while(j < n){
            if((arr[j] == 1) || (arr[j] == 0 && zc < m ) ){
                c++;
                if(arr[j] == 0){
                    zc++;
                }
                j++;
            }else if(zc >= m){
                cmax = Math.max(cmax, c);
                while(zc >= m){
                    if(arr[i] == 1){
                        c--;
                    }else if(arr[i] == 0){
                        c--;zc--;
                    }
                    i++;
                }
            }
            cmax = Math.max(cmax, c);
        }
        return cmax;
    }
}
