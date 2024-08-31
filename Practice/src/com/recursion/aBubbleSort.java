package com.recursion;

import java.util.Arrays;
// bubblesort and selection sort are similer
public class aBubbleSort {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[] {556, 77, 89, 0, 3, 6, 88, 90, 2};
		bubbleSort(arr, 0, arr.length -1);// in selection sort we pass arr.length as we are checking upto last element
		// but in bubble sort we pass arr.length -1 as we skipp the last element check
		System.out.println("i am res :: " +  Arrays.toString(arr));
	}
	//before start writing a single line of code imagine first
	static void bubbleSort(int[] arr, int i, int j) {
		if(j == 0)
			return;
		if(i < j) {//this if to place largest element at its correct position i.e, last position
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			bubbleSort(arr, i +1, j);
		}else {//then it will invoke the upper if with updated index to place next element at its correct position
			bubbleSort(arr, 0, j -1);
		}
	}
}
