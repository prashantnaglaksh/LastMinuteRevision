package com.bsqs;

public class bswoodcuttingmakeeasy {
	public static void main(String[] args) {
		int[] arr0 = {10, 15, 17, 20};
		int tar0 = 7;//ans 15
		int[] arr1 = {4, 26, 40, 42, 46};
		int tar1 = 20;//ans 36
		
		System.out.println(woodcollectedatgivenheight(arr1,36));

		int res2 = bswoodcuttingmakeeasybfhelper(arr1, 20);
		System.out.println("i ama res from bsbitonichelper :: " +  res2);
	}
	
	static int bswoodcuttingmakeeasybfhelper(int[] arr, int tar) {
		int startElement = 0;
		int endElement = arr[arr.length - 1];
		while(startElement <= endElement) {
			int midElement = startElement + (endElement - startElement)/2;
			int woodcollected = woodcollectedatgivenheight(arr, midElement);
			if(tar == woodcollected) {
				return midElement;
			}else if(woodcollected < tar) {
				endElement = midElement - 1;
			}else {
				startElement  = midElement + 1;
			}
		}
		return -1;
		
	}
	
	static int woodcollectedatgivenheight(int[] arr, int tar) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= tar) {
				ans = ans + arr[i] - tar;
			}
		}
		return ans;
	}
}
