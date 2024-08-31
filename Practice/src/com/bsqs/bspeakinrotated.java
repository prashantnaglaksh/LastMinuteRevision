package com.bsqs;

public class bspeakinrotated {
	public static void main(String[] args) {
		int[] arr0 = {1, 2, 4, 6, 99, 101};//edge
		int[] arr1 = {101, 1, 2, 4, 6, 99};
		int[] arr2 = {99, 101, 1, 2, 4, 6};
		int[] arr3 = {4, 6, 99, 101, 1, 2};
		int[] arr4 = {2, 4, 6, 99, 101, 1};//edge
		
		int res = bspeakinrotatedbfhelper(arr3);
		System.out.println("i ama res from bspeakinrotatedbfhelper :: " +  res);
		int res2 = bspeakinrotatedhelper(arr3);
		System.out.println("i ama res from bspeakinrotatedhelper :: " +  res2);
	}
	
	//how you decide that aan array is sorted if start element is smaller then end element
	//will return lowest element index
	static int bspeakinrotatedhelper(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while(startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex)/2; 
			int midElement = arr[midIndex];
			int nextIndex  = (midIndex +1)%arr.length;
			int prevIndex  = (midIndex + arr.length - 1)%arr.length;
			
			
			if((midElement <= arr[prevIndex]) && (midElement <= arr[nextIndex]) ) { //mid -1 > mid < mid + 1
				return midIndex;
			}else if(midElement <= arr[endIndex]) {
				endIndex = midIndex - 1;
			}else if(midElement >= arr[startIndex]) {
				startIndex  = midIndex + 1;
			}
		}
		return -1;
	
		
	}
	
	static int bspeakinrotatedbfhelper(int[] arr) {
		int min  = arr[0];
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min  = arr[i];
				ans = i;
			}
		}
		return ans;
	}
}
