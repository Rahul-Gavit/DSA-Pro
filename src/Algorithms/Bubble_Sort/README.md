# Bubble Sort

## Approach

Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. Here’s a detailed breakdown of the approach:
Note: push the largest element into last

### 1. Initialization

- **Function Signature**: `public static void bubbleSort(int arr[])`
- **Input**: An integer array `arr` that needs to be sorted in ascending order.

### 2. Outer Loop

- **Purpose**: To ensure that all elements are sorted.
- **Loop**: `for (int turn = 0; turn < arr.length - 1; turn++)`
  - Iterates from 0 to `arr.length - 2`.
  - Each iteration represents a pass through the array, where the largest unsorted element is moved to its correct position.

### 3. Inner Loop

- **Purpose**: To perform the comparison and swapping of adjacent elements.
- **Loop**: `for (int j = 0; j < arr.length - 1 - turn; j++)`
  - Iterates from 0 to `arr.length - 2 - turn`.
  - The number of elements to consider in each pass decreases as the largest elements are sorted and moved to the end of the array.

### 4. Comparison and Swap

- **Condition**: `if (arr[j] > arr[j + 1])`
  - Compares the current element `arr[j]` with the next element `arr[j + 1]`.
- **Action**:
  - If `arr[j]` is greater than `arr[j + 1]`, the two elements are swapped.
  - This ensures that the largest element among the unsorted elements moves to its correct position.

### 5. Termination

- **End Condition**: The outer loop continues until all elements are sorted.
- **Sorting Completion**: After completing all passes, the array is sorted in ascending order.

### Example

Given an array `[64, 34, 25, 12, 22, 11, 90]`, the algorithm performs the following steps:

1. **Pass 1**:

   - Compare and swap adjacent elements, moving the largest element `90` to the end.

2. **Pass 2**:

   - Continue comparing and swapping in the unsorted portion, moving the next largest element to its correct position.

3. **Continue**:
   - Repeat the process until the entire array is sorted.

## Complexity

- **Time Complexity**:

  - **Worst-case**: \(O(n^2)\) - when the array is sorted in reverse order.
  - **Average-case**: \(O(n^2)\) - for a random order of elements.
  - **Best-case**: \(O(n)\) - if the array is already sorted.

- **Space Complexity**: \(O(1)\) - Bubble Sort is an in-place sorting algorithm.
