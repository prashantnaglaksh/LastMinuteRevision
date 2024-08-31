//program to sort an arrray of 0,1,2
package com.array;
import java.util.*;

public class Sortarray {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,0,1,2,0,1,2};
        //sortViaCounting(array);
        sortViaSingleLoop(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortViaSingleLoop(int[] array){
        int low  = 0;
        int mid = 0;
        int high = array.length - 1;
        int temp = 0;
        while(mid <= high){
            if(array[mid] == 0){
                temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;
                low++;
                mid++;
            }else if(array[mid] == 1){
                mid++;
            }else{
                temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
    }


    // sorting by counting the occurence of 0,1 and 2 and then
    //printing
    public static  void sortViaCounting(int[] array){
        int low = 0;
        int mid = 0;
        int high = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                low++;
            }else if(array[i] == 1){
                mid++;
            }else{
                high++;
            }
        }
        int i = 0;
        while(low > 0){
            array[i] = 0;
            i++;
            low--;
        }
        while(mid > 0){
            array[i] = 1;
            i++;
            mid--;
        }
        while(high > 0){
            array[i] = 2;
            i++;
            high--;
        }
    }
}