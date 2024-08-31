package com.codingPattern.bitManupulation;
/*
 * https://www.youtube.com/watch?v=nttpF8kwgd4&list=PLgUwDviBIf0rnqh8QsJaHyIX7KUiaPUv7&index=2
 */
public class shiftOperator {
	public static void main(String[] args) {
		checkIfKthDigitIsSetUsingRightShift(13, 2);
		checkIfKthDigitIsSetUsingLeftShift(13, 2);
		setKthBit(9, 2);
		clearKthBit(13, 2);
	}
	/*
	 * Given a number n, check weather its kth digit is set(1) or not
	 * 1101 -> 13
	 * 0011 -> 13 >> 2
	 * 0001 -> 1
	 * 0001 -> (13 >> 2) & 1
	 * Here we are doing this with right shift but we can also do it with left shift operator then we will k left shift 1 and & with n
	 * the if not equal to 0 then set else not set
	 */
	static void checkIfKthDigitIsSetUsingRightShift(int n, int k) {
		//k right shift the number and & with n itself
		if( ((n >> k) & 1) == 1 ) {
			System.out.println("kth bit is set");
		}else {
			System.out.println("kth bit is not set");
		}
	}
	/*
	 * if we want to set the kth bit then k left shift 1 and | (or) with n
	 */
	static void checkIfKthDigitIsSetUsingLeftShift(int n, int k) {
		if ( ( n & (1 << k) ) == 0) {
			System.out.println("kth bit is not set");
		}else {
			System.out.println("kth bit is set");
		}
	}
	static void setKthBit(int n, int k) {
		int res  = (1 << k) | n;
		System.out.println(n + " after set kth bit :: " + res);
	}
	static void clearKthBit(int n, int k) {
		int res  = ~(1 << k) & n;
		System.out.println(n + " after clear kth bit :: " + res);
	}
}
