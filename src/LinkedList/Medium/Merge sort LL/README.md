# MergeSort Linked List

## Problem Statement

The `MergeSortLL` class is designed to implement the merge sort algorithm on a singly linked list. The goal is to sort a linked list in ascending order using the efficient merge sort technique, which is well-suited for sorting linked lists due to its O(n log n) time complexity and stability.

### Example

Given the linked list: `5 -> 4 -> 3 -> 2 -> 1`

The output after sorting with merge sort would be: `1 -> 2 -> 3 -> 4 -> 5`

## Approach Overview

The solution is based on the merge sort algorithm, which is a divide-and-conquer algorithm. It involves splitting the list into smaller sublists, sorting those sublists, and then merging them back together in sorted order.

### Step-by-Step Approach

### Step 1: Add Nodes to the Linked List

- Nodes are added to the beginning of the list using the `addFirst` method. This method creates a new node and inserts it at the head of the list.

### Step 2: Finding the Middle of the List

- To implement the merge sort, the linked list needs to be split into two halves. This is achieved using a two-pointer technique to find the middle of the list:
  - A `slow` pointer that moves one step at a time.
  - A `fast` pointer that moves two steps at a time.
- When the `fast` pointer reaches the end, the `slow` pointer will be at the middle of the list. This middle node is used to split the list into two halves.

### Step 3: Merging Two Sorted Lists

- The `merge` method is used to merge two sorted linked lists into one sorted list. This method takes two sorted lists as input and merges them by comparing the data in each node and linking them in sorted order.
- A dummy node (`mergeLL`) is used to facilitate the merging process, and a temporary pointer (`temp`) is used to keep track of the end of the merged list.

### Step 4: Recursively Sorting the List

- The `mergeSort` method is the core of the sorting algorithm:
  - **Base Case**: If the linked list is empty or has only one node, it is already sorted, and the method returns the head.
  - **Recursive Case**: The list is split into two halves using the middle node found in Step 2. The left and right halves are recursively sorted using `mergeSort`.
  - The sorted halves are then merged back together using the `merge` method.

### Step 5: Printing the List

- The `printLL` method is used to print the current state of the linked list. This is useful for visualizing the list before and after sorting.

## Complexity Analysis

- **Time Complexity**: The time complexity of merge sort on a linked list is O(n log n), where `n` is the number of nodes in the list. This is because the list is split into two halves in O(log n) steps, and merging takes O(n) time.
- **Space Complexity**: The space complexity is O(1) for the linked list itself since no additional space proportional to the input size is used. However, the recursive stack space for merge sort contributes to O(log n) space complexity.

## Edge Cases Handled

- **Empty List**: If the linked list is empty, the `mergeSort` method returns immediately.
- **Single Node**: If the list contains only one node, no sorting is required, and the method returns the head.

## Example Usage Flow

1. **Adding Elements**: Elements are added to the list using the `addFirst` method. This creates an unsorted linked list.
2. **Printing the List**: The original list is printed to show the unsorted state.
3. **Applying Merge Sort**: The `mergeSort` method is called to sort the linked list.
4. **Printing the Sorted List**: The sorted linked list is printed to show the result of the merge sort operation.

## Conclusion

The `MergeSortLL` class provides an efficient way to sort a linked list using the merge sort algorithm. By leveraging the divide-and-conquer strategy, the solution effectively handles large lists and ensures optimal time complexity. This approach is well-suited for linked lists as it does not require random access to elements, making it preferable over other sorting algorithms like quicksort.
