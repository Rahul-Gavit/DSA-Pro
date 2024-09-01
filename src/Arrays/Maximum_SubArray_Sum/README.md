# Kadane's Algorithm

## Overview

Kadane's Algorithm is an efficient method for finding the maximum sum of a contiguous subarray within a one-dimensional array of numbers. It operates in linear time, O(n), making it suitable for large datasets.

## Problem Statement

Given an array of integers, you need to find the contiguous subarray (containing at least one number) which has the largest sum and return that sum.

## Algorithm Description

Kadane's Algorithm maintains two variables:

1. `cs` (current sum): Tracks the sum of the current subarray.
2. `max`: Tracks the maximum sum encountered so far.

### Steps:

1. Initialize `max` with the first element of the array.
2. Iterate through the array, updating `cs` to either the current element or the sum of `cs` plus the current element, whichever is larger.
3. Update `max` with the maximum value between `max` and `cs`.
4. Continue until the end of the array.
