# Selection Sort

## Approach

Selection Sort is a simple comparison-based sorting algorithm that works by repeatedly finding the minimum element from the unsorted portion of the array and moving it to the beginning. Here’s a detailed breakdown of the approach:

### 1. Initialization

- **Function Signature**: `public static void selectionSort(int arr[])`
- **Input**: An integer array `arr` that needs to be sorted in ascending order.

### 2. Outer Loop

- **Purpose**: To iterate through each element of the array and place it in its correct position.
- **Loop**: `for (int i = 0; i < arr.length; i++)`
  - Iterates from the start of the array to the second-to-last element.
  - `i` represents the current position where the minimum element will be placed.

### 3. Find Minimum Element

- **Purpose**: To find the smallest element in the unsorted portion of the array.
- **Loop**: `for (int j = i + 1; j < arr.length; j++)`

  - Iterates through the elements from `i + 1` to the end of the array.
  - Compares each element with the current minimum (`arr[minPos]`).

- **Condition**: `if (arr[minPos] > arr[j])`
  - If the current element `arr[j]` is smaller than the current minimum `arr[minPos]`, update `minPos` to the index `j`.

### 4. Swap Elements

- **Action**:

  - After finding the minimum element in the unsorted portion, swap it with the element at index `i`.
  - This step places the minimum element in its correct position in the sorted portion of the array.

- **Swap Code**:
  ```java
  int temp = arr[minPos];
  arr[minPos] = arr[i];
  arr[i] = temp;
  ```
