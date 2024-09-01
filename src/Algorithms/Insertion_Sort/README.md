# Insertion Sort

## Approach

Insertion Sort is a simple comparison-based sorting algorithm that builds the final sorted array one item at a time. It is much like sorting playing cards in your hands. Here’s a detailed breakdown of the approach:

### 1. Initialization

- **Function Signature**: `public static void insertionSort(int arr[])`
- **Input**: An integer array `arr` that needs to be sorted in ascending order.

### 2. Outer Loop

- **Purpose**: To iterate through the array and sort the elements.
- **Loop**: `for (int i = 1; i < arr.length; i++)`
  - Starts from the second element (index `1`) and iterates to the end of the array.
  - `i` represents the index of the element that is currently being inserted into the sorted portion of the array.

### 3. Current Element and Previous Index

- **Current Element**: `int curr = arr[i]`
  - The element to be inserted into the sorted portion of the array.
- **Previous Index**: `int prev = i - 1`
  - The index of the last element in the sorted portion of the array.

### 4. Shifting Elements

- **Purpose**: To make space for the `curr` element by shifting elements that are greater than `curr`.
- **Loop**: `while (prev >= 0 && arr[prev] > curr)`
  - Continues to shift elements to the right until it finds the correct position for `curr`.
- **Action**:
  - `arr[prev + 1] = arr[prev]`
  - Decreases `prev` by 1 to check the next element.

### 5. Insertion

- **Purpose**: Place the `curr` element into its correct position in the sorted portion.
- **Insertion Code**:
  ```java
  arr[prev + 1] = curr;
  ```
