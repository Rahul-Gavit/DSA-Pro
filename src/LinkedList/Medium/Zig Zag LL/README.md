# ZicZac Linked List

## Problem Statement

The `ZicZacLL` class is designed to rearrange a singly linked list into a zig-zag pattern. The objective is to reorder the list such that after the middle element, the subsequent elements are reversed and alternately interleaved with the first half of the list.

### Example

Given the linked list: `1 -> 2 -> 3 -> 4 -> 5 -> 6`

The expected output after applying the zig-zag operation is: `1 -> 6 -> 2 -> 5 -> 3 -> 4`

## Approach Overview

### Step 1: Find the Middle of the List

- The first step is to identify the middle of the linked list. This is achieved using a two-pointer approach:
  - `slow` pointer moves one step at a time.
  - `fast` pointer moves two steps at a time.
- When the `fast` pointer reaches the end of the list, the `slow` pointer will be at the middle. This method is efficient, with a time complexity of O(n).

### Step 2: Reverse the Second Half of the List

- Once the middle is found, the second half of the list starting from the middle is reversed.
- Reversing the second half prepares the list for the zig-zag interleaving with the first half.

### Step 3: Merge the Two Halves in a Zig-Zag Fashion

- After reversing the second half, we interleave the nodes from the first half and the reversed second half.
- This process involves alternating nodes between the two halves, creating the desired zig-zag pattern.

### Edge Cases Handled

- **Empty List**: If the list is empty, the function returns immediately without modification.
- **Single Node**: If the list contains only one node, no changes are made since there’s nothing to rearrange.

## Usage

The `ZicZacLL` class includes methods to add elements to the list and print the linked list before and after applying the zig-zag operation.

### Example Usage Flow

1. **Adding Elements**: Elements are added to the list using the `addLast` method.
2. **Printing the List**: The original list is printed.
3. **Applying Zig-Zag Operation**: The `zicZac` method is called to reorder the list.
4. **Printing the Modified List**: The zig-zag modified list is printed.

## Complexity Analysis

- **Time Complexity**: The overall time complexity of the solution is O(n), where `n` is the number of nodes in the list. This is because we make a single pass to find the middle, another pass to reverse the second half, and a final pass to merge the two halves.
- **Space Complexity**: The space complexity is O(1) since the solution only uses a constant amount of extra space for pointers and variables.

## Conclusion

The `ZicZacLL` class efficiently rearranges a linked list into a zig-zag pattern by combining the operations of finding the middle, reversing the second half, and interleaving the nodes. This solution is optimal in terms of both time and space complexity, making it well-suited for handling large linked lists.
