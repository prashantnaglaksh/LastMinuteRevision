package com.searchAlgorithm;

//always think of Brute Force Approach First
// to apply binarySearch array must be sorted
//first verify the direction of array sorting
//if sorted array is given try to apply binary search algo first
//observe when condition breach what are start and end index then and then observe what to return in case of applying
//binary search approach to solve a problem

public class binarySearch {
	public static void main(String[] args) throws Exception {
		int[] arrAsc = new int[] {0, 3, 6, 77, 88, 90};
		int[] arrDsc = new int[] {90, 88, 77, 6, 3, 0};
		int target = 3;
		int res = binarySearchHelper(arrAsc, target);
		System.out.println("i am res :: " +  res);
	}

	static int binarySearchHelper(int[] arr  , int target) {
		int startIndex = 0;
		int endIndex = arr.length -1;
		boolean sortDir = arr[0] < arr[arr.length - 1];
		// we can not directly alter startIndex or endIndex we have to first check the direction in which array is sorted
		// sortDir true -> asc else desc
		while(startIndex <= endIndex) {
			int oldMid = (startIndex + endIndex)/2; //here we can have problem as for large array (startIndex + endIndex) cab be 
													// out of range of integer
			int midIndex = startIndex + (endIndex - startIndex)/2;
			int midElement = arr[midIndex];
			if(midElement == target) {
				return midIndex;
			}
			if(sortDir) {
				if(target > midElement) {
					startIndex = midIndex + 1;
				}else {
					endIndex = midIndex - 1;
				}
			}else {
				if(target < midElement) {
					startIndex = midIndex + 1;
				}else {
					endIndex = midIndex - 1;
				}
			}
			
		}
		return -1;
	}
}
