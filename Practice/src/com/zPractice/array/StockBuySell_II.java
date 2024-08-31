package com.zPractice.array;
/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class StockBuySell_II {
	public static void main(String[] args) {
		int res = maxProfit(new int[] {7,1,5,3,6,4});
		System.out.println("Maximum profit = " + res);
	}

	private static int maxProfit(int[] price) {
		int buyPrice = price[0];
		int maxProfit = 0;
		int profit = 0;
		for(int i = 0; i < price.length; i++) {
			if(price[i] < buyPrice) {
				buyPrice = price[i];
			}
			//here we sell so we have to buy again
			profit = price[i] - buyPrice;
			if(profit > 0)
				maxProfit = maxProfit + profit;
			//buying it again on the same day of selling
			buyPrice = price[i];
		}
		return maxProfit;
	}
}
