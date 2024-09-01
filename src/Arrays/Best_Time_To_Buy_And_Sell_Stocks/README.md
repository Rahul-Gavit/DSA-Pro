# Buy and Sell Stocks

## Overview

The "Buy and Sell Stocks" problem involves determining the maximum profit that can be achieved by buying and then selling a stock, given an array of stock prices where each element represents the price of the stock on a given day.

## Problem Statement

Given an array of integers representing the stock prices on different days, calculate the maximum profit you can achieve by buying on one day and selling on a later day. You are only allowed to complete one transaction (buy one day and sell on a later day).

## Approach

The approach involves iterating through the stock prices while maintaining two variables:

1. `buyPrice`: The minimum price encountered so far, representing the optimal buying price.
2. `maxProfit`: The maximum profit that can be achieved based on the current `buyPrice`.

### Steps:

1. **Initialize Variables:**

   - `maxProfit` to `0` to track the maximum profit.
   - `buyPrice` to `Integer.MAX_VALUE` to ensure any price encountered is lower.

2. **Iterate Through the Array:**

   - For each price, check if selling at the current price (`currDayPrice`) would yield a higher profit compared to the current `maxProfit`.
   - If the current price is lower than `buyPrice`, update `buyPrice` to this new lower price.
   - If the current price is higher than `buyPrice`, calculate the potential profit and update `maxProfit` if this profit is higher than the current `maxProfit`.

3. **Return the Maximum Profit:**
   - After processing all the prices, return `maxProfit`.
