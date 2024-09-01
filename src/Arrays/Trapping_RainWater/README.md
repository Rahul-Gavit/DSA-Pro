# Trapped Water Calculation

## Overview

The trapped water problem involves calculating the amount of water that can be trapped between bars of different heights, represented by an array. This problem can be efficiently solved using an approach that involves precomputing the maximum heights to the left and right of each bar.

## Problem Statement

Given an array of integers representing the heights of bars in a histogram, compute how much water can be trapped between the bars after a rain.

## Approach

The approach involves three main steps:

1. **Calculate Maximum Heights to the Left (`maxLeft`):**
   - For each bar, compute the maximum height of bars to its left.
2. **Calculate Maximum Heights to the Right (`maxRight`):**
   - For each bar, compute the maximum height of bars to its right.
3. **Calculate Trapped Water:**
   - For each bar, the trapped water above it is determined by the minimum of the maximum heights to its left and right, minus the height of the bar itself.

### Steps:

1. **Initialize Arrays:**

   - `maxLeft`: Stores the maximum height to the left of each bar.
   - `maxRight`: Stores the maximum height to the right of each bar.

2. **Fill `maxLeft`:**

   - Start from the first bar and propagate the maximum height from left to right.

3. **Fill `maxRight`:**

   - Start from the last bar and propagate the maximum height from right to left.

4. **Calculate Trapped Water:**
   - For each bar, compute the trapped water as the difference between the minimum of `maxLeft` and `maxRight` at that position and the height of the bar.
