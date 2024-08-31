package com.recursion;

import java.util.Arrays;
//bubblesort and selection sort are similer
public class bSelectionSort {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[] {556, 77, 89, 0, 3, 6, 88, 90, 2};
		selectionSortHelper(arr, 0, arr.length, 0);// here we are passing arr.length as we are checking upto last element
		// but in bubble sort we pass arr.length -1 as we skipp the last element check
		System.out.println("i am res :: " +  Arrays.toString(arr));
	}
	static void selectionSortHelper(int[] arr, int i, int j, int max) {
		//base condition
		if(j == 0)
			return;
		//write recusuion code as you are doing iterative code considering that you have to sort
		//only 1 element of the array instead of whole array
		if(i < j) {
			if(arr[i] > arr[max]) {
				selectionSortHelper(arr, i +1, j, i);
			}else {
				selectionSortHelper(arr, i +1, j, max);
			}
		}else {//now swap max with last element of the array
			int temp = arr[j -1];// j-1 as index starts from 0
			arr[j -1] = arr[max];
			arr[max] = temp;
			selectionSortHelper(arr, 0, j -1, 0);
		}
	}
}
