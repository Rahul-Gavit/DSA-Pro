# Stock Span Problem

This Java program solves the **Stock Span Problem** using a stack-based approach. The stock span is defined as the number of consecutive days leading up to a given day where the price of the stock was less than or equal to the price on the current day.

## Problem Statement

Given an array `stocks[]` where each element represents the price of a stock on a given day, the goal is to calculate the span of stock prices for each day. The span of a stock price on a particular day is the maximum number of consecutive days (starting from that day and going backward) where the price was less than or equal to the price on that day.

## Approach

1. **Initialize the Span Array:**

   - Create a `span[]` array where each element will store the span value for the corresponding day in `stocks[]`.
   - The algorithm uses a stack to efficiently calculate the span for each day in `O(n)` time complexity, where `n` is the number of days.

2. **Use a Stack for Efficient Computation:**

   - Use a `Stack<Integer>` to store the indices of the stock prices in decreasing order. This helps in finding the nearest previous higher stock price efficiently.

3. **Handle the First Day:**

   - For the first day, the span is always `1` because there are no previous days to compare.

4. **Iterate Through the Stocks:**

   - For each stock price from the second day onward:
     - **Pop Elements:** While the stack is not empty and the current stock price is greater than the price at the index stored at the top of the stack, pop elements from the stack.
     - **Calculate Span:** If the stack becomes empty, it means that the current price is the highest so far, so the span is the number of days from the start (i.e., `i + 1`). Otherwise, the span is the difference between the current index and the index at the top of the stack (`i - s.peek()`).
     - **Push Current Index:** Push the current index onto the stack.

5. **Output the Span Array:**
   - After iterating through all stock prices, print the span array which contains the span values for each day.

## Example

Consider the stock prices: `stocks[] = {100, 80, 60, 70, 60, 85, 100}`

The output spans will be: `span[] = {1, 1, 1, 2, 1, 5, 7}`

### Explanation:

- On day 1, the price is `100`, and there are no previous days with a higher price, so the span is `1`.
- On day 2, the price is `80`, which is less than `100`, so the span is `1`.
- On day 3, the price is `60`, which is less than `80`, so the span is `1`.
- On day 4, the price is `70`, which is greater than `60` but less than `80`, so the span is `2`.
- On day 5, the price is `60`, which is less than `70`, so the span is `1`.
- On day 6, the price is `85`, which is greater than all the previous prices, so the span is `5`.
- On day 7, the price is `100`, which is the highest price seen, so the span is `7`.
