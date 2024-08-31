package com.zPractice.array;

/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {
	public static void main(String[] args) {
		boolean res = isLastIndexReachable(new int[] {2,3,1,1,4});
		System.out.println("Is Last Index Reachable = " + res);
	}

	private static boolean isLastIndexReachable(int[] nums) {
		int maxIndexReachable = 0;
//		idea is i will iterate whole array and will keep maximizing the maxIndexReachable
//		and return if maxIndexReachable is less then my iteration index
//		return true if maxIndexReachable greater then or equal to array size
		for(int i = 0; i < nums.length; i++) {
			if(i > maxIndexReachable)
				return false;
			maxIndexReachable  = Math.max(maxIndexReachable, i + nums[i]);
			if(maxIndexReachable >= nums.length - 1)
				return true;
		}
		return false;
	}
}
