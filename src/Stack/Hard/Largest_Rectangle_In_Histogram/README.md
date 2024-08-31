# Largest Rectangle Area in Histogram

## Overview

The `largestRectangleArea` function calculates the area of the largest rectangle that can be formed in a histogram. The histogram is represented as an array of integers where each integer represents the height of the bars in the histogram. The goal is to find the maximum rectangular area that can be enclosed by the bars.

## Approach

The algorithm uses two key techniques to solve the problem efficiently: **Next Smaller Element to the Right (NSR)** and **Next Smaller Element to the Left (NSL)**. The approach can be broken down into the following steps:

1. **Initialize Arrays and Stack**:

   - Use two arrays `nsr` and `nsl` to store the indices of the next smaller elements to the right and left of each bar, respectively.
   - Initialize an empty stack to help in finding the next smaller elements.

2. **Calculate Next Smaller Elements to the Right (NSR)**:

   - Traverse the histogram from right to left.
   - For each bar, pop elements from the stack while the bar at the top of the stack is greater than or equal to the current bar.
   - If the stack is empty, it means there is no smaller element to the right, so store the length of the histogram. Otherwise, store the index of the top element of the stack as the next smaller element to the right.
   - Push the current bar's index onto the stack.

3. **Calculate Next Smaller Elements to the Left (NSL)**:

   - Traverse the histogram from left to right.
   - For each bar, pop elements from the stack while the bar at the top of the stack is greater than or equal to the current bar.
   - If the stack is empty, it means there is no smaller element to the left, so store `-1`. Otherwise, store the index of the top element of the stack as the next smaller element to the left.
   - Push the current bar's index onto the stack.

4. **Calculate Maximum Area**:
   - For each bar in the histogram: - Compute the width of the rectangle that can be formed using the height of the current bar. The width is determined by the difference between the indices of the next smaller elements to the right and left. - Calculate the area of the rectangle using the height and width. - Update the maximum area if the current rectangle's area is larger.
     e
