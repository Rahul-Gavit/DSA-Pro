# PalindromeLL: Check Palindrome in a Singly Linked List

## Problem Statement

The `PalindromeLL` class provides functionality to determine if a singly linked list is a palindrome. A linked list is considered a palindrome if the sequence of its elements reads the same backward as forward.

### Example

Given a linked list: `1 -> 2 -> 2 -> 1`

- The linked list is a palindrome because it reads the same from both ends.

## Approach Overview

The approach to solve this problem involves the following steps:

1. **Finding the Middle of the Linked List**: Use the two-pointer technique to find the middle of the list. This involves a slow pointer that advances one node at a time and a fast pointer that advances two nodes at a time.

2. **Reversing the Second Half of the List**: Once the middle is found, reverse the second half of the list. This helps in comparing the reversed second half with the first half.

3. **Comparing the Two Halves**: Traverse the first half of the list and the reversed second half simultaneously to check if all corresponding elements are equal.

### Detailed Steps

1. **Finding the Middle Node**:

   - Use two pointers: `slow` and `fast`.
   - Move `slow` by one step and `fast` by two steps.
   - When `fast` reaches the end, `slow` will be at the middle node.

2. **Reversing the Second Half**:

   - Start from the middle node.
   - Reverse the list starting from the middle node by iterating through the list and adjusting the `next` pointers.

3. **Checking for Palindrome**:
   - Compare nodes from the start of the list and the start of the reversed second half.
   - If all corresponding nodes match, the list is a palindrome.

### Handling Edge Cases

- **Empty List**: An empty list or a list with only one element is considered a palindrome.
- **Even Length Palindrome**: Lists with even numbers of elements need to be properly reversed and compared.
- **Odd Length Palindrome**: The middle element is ignored when comparing, as it does not affect the palindromic property.

## Complexity Analysis

- **Time Complexity**: O(n)

  - Finding the middle, reversing the second half, and comparing the two halves all require linear time.

- **Space Complexity**: O(1)
  - The solution uses a constant amount of extra space for pointers and does not require additional data structures.

## Example Usage Flow

1. **Creating the List**: Nodes are added to the list using the `addLast` method, which appends new nodes to the end of the list.
2. **Printing the List**: The `printLL` method displays the current state of the linked list.
3. **Checking for Palindrome**: The `checkPalindrome` method determines if the list is a palindrome and returns a boolean result.

## Conclusion

The `PalindromeLL` class effectively checks if a singly linked list is a palindrome by leveraging efficient techniques to find the middle, reverse the second half, and compare both halves. This approach ensures that the palindrome check is performed in linear time with constant space complexity.
