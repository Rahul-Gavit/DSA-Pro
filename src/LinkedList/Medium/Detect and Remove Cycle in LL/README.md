# Detect and Remove Cycle in a Linked List

## Problem Statement

The `DetectRemoveCycle` class provides functionality to detect and remove a cycle (loop) in a singly linked list. A cycle occurs when a node's `next` pointer points back to one of the previous nodes in the list, forming a loop. Detecting and removing such cycles is essential to prevent infinite loops during traversal and to maintain the integrity of the data structure.

### Example

Consider the linked list:

12 -> 13 -> 14 -> 15 ^ | | v -----

In this example, there is a cycle from node `15` back to node `14`. The `DetectRemoveCycle` class can detect this cycle and then remove it, resulting in a linear linked list:

12 -> 13 -> 14 -> 15 -> null

## Approach Overview

The approach involves two main tasks:

1. **Cycle Detection**: Using Floyd's Cycle-Finding Algorithm (also known as the Tortoise and Hare algorithm).
2. **Cycle Removal**: Once a cycle is detected, find the start of the cycle and remove it by setting the appropriate `next` pointer to `null`.

### Step-by-Step Approach

### Step 1: Detect Cycle Using Floyd's Cycle-Finding Algorithm

- Two pointers, `slow` and `fast`, are initialized to the head of the list.
  - `slow` moves one step at a time.
  - `fast` moves two steps at a time.
- If there is a cycle, `slow` and `fast` will eventually meet at the same node.
- If `fast` reaches the end of the list (`fast == null` or `fast.next == null`), there is no cycle.

### Step 2: Remove the Cycle

- After detecting a cycle, initialize the `slow` pointer to the head again while keeping `fast` at the meeting point.
- Move both pointers one step at a time until they meet. The point where they meet is the start of the cycle.
- To remove the cycle:
  - If the cycle starts at the head, traverse the list using the `fast` pointer to find the node that points back to the head and set its `next` to `null`.
  - Otherwise, find the node just before the start of the cycle using a `prev` pointer and set `prev.next` to `null`.

### Step 3: Printing the Linked List

- The `printLL` method is used to print the current state of the linked list. It prints all nodes until `null` is encountered, showing that the cycle has been successfully removed.

## Complexity Analysis

- **Time Complexity**: O(n)

  - Detecting a cycle using Floyd’s algorithm takes O(n) time since both `slow` and `fast` pointers traverse the list linearly.
  - Removing the cycle also takes O(n) time to find the starting point of the cycle and set the necessary `next` pointer to `null`.

- **Space Complexity**: O(1)
  - The algorithm uses only a fixed amount of additional space (pointers), making it space-efficient.

## Edge Cases Handled

- **No Cycle**: The list is already acyclic. In this case, the `removeCycle` method simply returns without any changes.
- **Cycle at the Head**: If the cycle starts at the head, the algorithm correctly identifies and removes the cycle.
- **Single Node Cycle**: If there is only one node and it forms a cycle (i.e., it points to itself), the algorithm can handle this scenario by breaking the cycle.

## Example Usage Flow

1. **Creating a List**: The main method creates a linked list and intentionally introduces a cycle for testing purposes.
2. **Cycle Detection**: The `detectCycle` method checks if the list contains a cycle and returns `true` or `false`.
3. **Cycle Removal**: The `removeCycle` method removes the detected cycle from the list.
4. **Printing the List**: The `printLL` method prints the list to verify that the cycle has been removed.

## Conclusion

The `DetectRemoveCycle` class efficiently detects and removes cycles in a linked list using Floyd's Cycle-Finding Algorithm. It is well-suited for detecting cycles in any linked list and removing them to ensure the list remains acyclic. The implementation is both time and space-efficient, making it a robust solution for handling cycles in singly linked lists.
