package com.bsqs;

public class bs {
	public static void main(String[] args) {
		int[] arr = {1, 5, 88, 99, 198};
		int res = bs(arr, 89);
		System.out.println("i ama res :: " +  res);
	}
	
	static int bs(int[] arr, int tar) {
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while(startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex)/2;
			int midElement = arr[midIndex];
			
			if(tar == midElement) {
				return midIndex;
			}else if(tar < midElement) {
				endIndex = midIndex - 1;
			}else {
				startIndex  = midIndex + 1;
			}
		}
		System.out.println(startIndex + "  " + endIndex);
		return -1;
	}
}
