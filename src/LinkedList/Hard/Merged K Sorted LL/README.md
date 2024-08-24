# MergedKSortedLL: Swap Nodes in a Linked List

## Problem Statement

The `MergedKSortedLL` class provides functionality to swap the k-th node from the beginning of a singly linked list with the k-th node from the end. This operation modifies the list by exchanging the values of these two nodes.

### Example

Given a linked list: `1 -> 2 -> 3 -> 4 -> 5`

- If `k = 2`, the 2nd node from the beginning is `2`, and the 2nd node from the end is `4`.
- After swapping, the modified list will be: `1 -> 4 -> 3 -> 2 -> 5`

## Approach Overview

The approach involves two main steps:

1. **Find the k-th Node from the Beginning**: Traverse the list to locate the k-th node from the start.
2. **Find the k-th Node from the End**: Traverse the list again to locate the k-th node from the end while keeping track of the k-th node from the beginning.

### Step-by-Step Approach

### Step 1: Finding the k-th Node from the Beginning

- Start from the head of the list and traverse `k-1` nodes to reach the k-th node from the beginning. This node is stored for later swapping.

### Step 2: Finding the k-th Node from the End

- Traverse the list again with two pointers:
  - Move the first pointer to the end of the list.
  - Move the second pointer from the beginning and keep it at a distance of `k` nodes from the first pointer.
- By the time the first pointer reaches the end, the second pointer will be at the k-th node from the end.

### Step 3: Swap the Nodes

- Swap the values of the two nodes identified:
  - The k-th node from the beginning.
  - The k-th node from the end.

### Handling Edge Cases

- **Empty List**: If the list is empty or has only one node, swapping is not applicable, and the list remains unchanged.
- **Single Node**: If the list contains only one node, no swapping is needed.
- **k Greater Than List Length**: If `k` is greater than the length of the list, the operation should ideally handle this gracefully. In this implementation, this situation is not explicitly handled but should be considered in practical applications.

## Example Usage Flow

1. **Creating the List**: Nodes are added to the list using the `addLast` method. This method appends nodes to the end of the list.
2. **Printing the List**: The `printLL` method displays the current state of the linked list.
3. **Swapping Nodes**: The `swapNodes` method swaps the k-th node from the beginning with the k-th node from the end.
4. **Printing the Updated List**: The `printLL` method displays the list after the swap operation to verify the results.

## Complexity Analysis

- **Time Complexity**: O(n)
  - Finding the k-th node from the beginning and end requires traversing the list, resulting in a linear time complexity.
- **Space Complexity**: O(1)
  - The solution uses a constant amount of additional space (pointers for traversal and swapping), making it space-efficient.

## Conclusion

The `MergedKSortedLL` class provides a simple and effective method to swap nodes in a singly linked list based on their position from the beginning and end. The implementation is straightforward and handles common scenarios efficiently, with clear and concise logic for node manipulation.
