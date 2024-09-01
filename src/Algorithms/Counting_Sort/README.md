# Counting Sort

## Approach

Counting Sort is a non-comparison-based sorting algorithm that works by counting the occurrences of each distinct element in the array and using this information to place each element in its correct position. Here’s a detailed breakdown of the approach:

### 1. Initialization

- **Function Signature**: `public static void countingSort(int arr[])`
- **Input**: An integer array `arr` that needs to be sorted in ascending order.

### 2. Find Maximum Element

- **Purpose**: Determine the range of elements in the array to create an appropriately sized `count` array.
- **Code**:
  ```java
  int largest = Integer.MIN_VALUE;
  for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
  }
  ```
