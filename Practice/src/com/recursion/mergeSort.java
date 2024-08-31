package com.recursion;

import java.util.Arrays;

//this is merge sort in place
public class mergeSort {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[] {556, 77, 89, 0, 3, 6, 88, 90, 2};
		mergeSortHelper(arr);
		System.out.println("i am res :: " +  Arrays.toString(arr));
	}
	
	static void mergeSortHelper(int[] arr){
		if(arr.length == 1)
			return;
		int mid = (0 + arr.length)/2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);//mid exclusive
		int[] right = Arrays.copyOfRange(arr, mid, arr.length );
		
		mergeSortHelper(left);
        mergeSortHelper(right);
		
		merge(arr, left, right);
	}
	
	static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;//for left
		int j = 0;//for right
		int k = 0;//for newArr
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		// now one there may be a case that one array will exhaust first so we will add another array element as it is as both array 
		//are sorted
		
		//from the below 2 while looponly one will execute
		while(i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
