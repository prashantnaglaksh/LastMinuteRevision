package com.zPractice.array;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class StockBuySell {
	public static void main(String[] args) {
		int res = maxProfit(new int[] {7,1,5,3,6,4});
		System.out.println("Maximum profit = " + res);
	}
	
	private static int maxProfit(int[] price) {
		int maxProfit = 0;
		int buyPrice = price[0];
		for(int i = 0; i < price.length; i++) {
			//we will buy if current < buyPrice and later will maximize the profit
			if(price[i] < buyPrice) {
				buyPrice = price[i];
//				maxProfit = Math.max(maxProfit, price[i] - buyPrice);
			}
			maxProfit = Math.max(maxProfit, price[i] - buyPrice);
		}
		return maxProfit;
	}
	
}
