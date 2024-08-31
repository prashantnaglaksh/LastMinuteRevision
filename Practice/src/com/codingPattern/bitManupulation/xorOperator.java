package com.codingPattern.bitManupulation;

public class xorOperator {
	public static void main(String[] args) {
		reverse2NumWithoutExtraSpace();
		findUniqueElement();
		findMissingNumber();
		
	}
	static void reverse2NumWithoutExtraSpace() {
		int a = 5;
		int b = 6;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("i am a :: " + a);
		System.out.println("i am b :: " + b);
	}
	/*
	 *  Given an array of integers where every element appears twice except for one, find that single unique element.
	 *  Each number that appears twice cancels out itself because x ^ x = 0.
		The unique number will remain because x ^ 0 = x.
	 */
	static void findUniqueElement() {
		int[] arr = new int[] {9, 7, 8, 5, 7, 9, 8,};
		int res = 0;
		for(int num : arr) {
			res  = res^num;
		}
		System.out.println("i am the unique number :: " + res);
	}
	/*
	 * Given an array of n numbers containing n-1 unique numbers from 0 to n-1, find the missing number.
	 * XOR of all numbers from 0 to n gives a combined XOR of a full sequence.
	   XOR of the array elements gives the combined XOR of the partial sequence.
	   XORing these two results gives the missing number due to the properties of XOR.
	 */
	static void findMissingNumber() {
		int[] arr = new int[] {9, 8, 5, 7, 0, 3, 1, 2, 4, 10};
		int n = 11;
		int xorOfArr = 0;
		int xorOfNumUpton = 0;
		for(int num : arr)
			xorOfArr ^= num;
		for(int i = 0; i < n; i++)
			xorOfNumUpton ^= i;
		int res = xorOfArr^xorOfNumUpton;//all duplicate number xor will be 0 and only the missing number will remain
		
		System.out.println("i am missing number :: " + res);
	}
}
