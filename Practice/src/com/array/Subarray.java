//subarray with given sum return index
package com.array;
import java.util.ArrayList;
import java.util.Arrays;

public class Subarray {
    public static void main(String[] args) {
        int[] array = new int[]{135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        //sortViaCounting(array);
        sub(array,array.length + 1, 468);
        //System.out.println(Arrays.toString(array));
    }
    public static void sub(int[] arr, int n, int s){

        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            if(sum == 0){
                a.add(i+1);
            }
            if(sum < s){
                sum = sum + arr[i];
                System.out.println("sum " + sum + " i="+i);
            }
            if(sum == s){
                a.add(i+1);
              //  System.out.println("sum " + sum + " i="+i);
                break;
            }
            if(sum > s){
                System.out.println("before" + i);
                i =temp++;
                sum = 0;
                a.remove(0);
                System.out.println("temp=" +temp + " i=" + i + " sum="+ sum);
            }
        }
        System.out.println(a);
    }
}
