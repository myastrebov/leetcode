package com.myastrebov.leetcode.array;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 *
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int sum = 0;
        boolean bought = false;
        for (int i = 0; i < prices.length - 1; i++) {
            if (!bought && prices[i] < prices[i + 1]) {
                sum = sum - prices[i];
                bought = true;
            } else if (bought && prices[i] > prices[i + 1]) {
                sum = sum + prices[i];
                bought = false;
            }
        }

        if (bought) {
            sum = sum + prices[prices.length - 1];
        }

        return sum;
    }

}
