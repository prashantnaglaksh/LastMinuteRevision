package com.bsqs;

/*
 * brtfrce approach
 * genric case
 * boundry case
 * then start coding
 * first write code to handle genric case then boundry case
 */
public class bsbitonic {
	public static void main(String[] args) {
		int[] arr0 = {1, 2, 4, 6, 99, 101};
		int[] arr1 = {101, 100, 99, 98};
		int[] arr2 = {0, 9, 10, 44, 56, 89, 101, 100, 99, 98};
		int res = bsbitonicbfhelper(arr2);
		System.out.println("i ama res from bsbitonicbfhelper :: " +  res);
		int res2 = bsbitonichelper(arr2);
		System.out.println("i ama res from bsbitonichelper :: " +  res2);
	}
	
	static int bsbitonichelper(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while(startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex)/2; //mid -1 < mid > mid + 1
			int midElement = arr[midIndex];
			
			//max element at boundry check
			if( (midIndex == (arr.length -1)) || (midIndex == 0) )
				return midIndex % arr.length;
			
			if((midElement > arr[midIndex - 1]) && (midElement > arr[midIndex + 1]) ) {
				return midIndex;
			}else if(midElement < arr[midIndex + 1]) {
				startIndex  = midIndex + 1;
			}else {
				endIndex = midIndex - 1;
			}
		}
		return -1;
	}
	static int bsbitonicbfhelper(int[] arr) {
		int res = arr[0];
		for(int i = 0; i < arr.length; i++) {
			res = Math.max(res, arr[i]);
		}
		return res;
	}
}
