package com.zPractice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
	public static void main(String[] args) {
		boolean res = twoSumExixts(new int[] {2,1,15,11,7}, 10);
		System.out.println("Two sum exists = " + res);
		
		boolean res2 = twoSumExixts2(new int[] {2,1,15,11,7}, 9);
		System.out.println("Two sum exists = " + res2);
		
		int[] result = getIndices(new int[] {2,1,15,11,7}, 9);
		System.out.println("Two sum indices = " + Arrays.toString(result));
	}

	private static int[] getIndices(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < nums.length; i ++) {
			int temp = target - nums[i];
			if(hm.containsKey(temp)) {
				return new int[] { hm.get(temp), i };
			}else {
				hm.put(nums[i], i);
			}
		}
		return null;
	}

	private static boolean twoSumExixts2(int[] nums, int target) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < nums.length; i ++) {
			int temp = target - nums[i];
			if(hs.contains(nums[i])) {
				return true;
			}else {
				hs.add(temp);
			}
		}
		return false;
	}

	private static boolean twoSumExixts(int[] nums, int target) {
		int l = 0;
		int m = nums.length - 1;
		Arrays.sort(nums);
		System.out.println("Sorted array = " + Arrays.toString(nums));
		while(l < m) {
			if((nums[l] + nums[m]) < target){
				l++;
			}else if((nums[l] + nums[m]) > target){
				m--;
			}else {
				return true;
			}
		}
		return false;
	}
}
