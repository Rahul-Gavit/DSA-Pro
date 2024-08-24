# Swap k-th Node from Beginning with k-th Node from End in a Linked List

## Problem Statement

Given a singly linked list and an integer `k`, swap the `k`-th node from the beginning with the `k`-th node from the end. Return the modified linked list.

### Example

- **Input**: `1 -> 2 -> 3 -> 4 -> 5`, `k = 2`
- **Output**: `1 -> 4 -> 3 -> 2 -> 5`

In the example above, the 2nd node from the beginning is `2`, and the 2nd node from the end is `4`. After swapping these nodes, the modified list becomes `1 -> 4 -> 3 -> 2 -> 5`.

## Solution Approach

To solve this problem efficiently, we use a two-pointer technique to find the `k`-th nodes from both the beginning and the end of the list in a single pass.

### Steps to Solve

1. **Handle Base Cases**:

   - If the linked list is empty (`head == null`) or has only one node (`head.next == null`), return the head, as no swapping is needed.

2. **Finding the k-th Node from the Beginning**:

   - Initialize two pointers, `first` and `second`, pointing to the head of the list.
   - Move the `first` pointer `k-1` steps forward to reach the `k`-th node from the beginning.
   - Store this node in a variable called `kthFromBegin`.

3. **Finding the k-th Node from the End**:

   - Move the `first` pointer to the end of the list while simultaneously moving the `second` pointer from the head.
   - When the `first` pointer reaches the last node, the `second` pointer will be at the `k`-th node from the end.

4. **Swapping the Values**:

   - Swap the values of the `kthFromBegin` node and the `k`-th node from the end (`second`). This approach avoids the complexity of rearranging the actual nodes.

5. **Return the Modified List**:
   - Return the head of the modified list.

### Complexity Analysis

- **Time Complexity**: `O(n)`, where `n` is the number of nodes in the list. This is because we traverse the list once to identify both `k`-th nodes.
- **Space Complexity**: `O(1)`, since only a few pointers and variables are used, regardless of the input list's size.

### Example Walkthrough

For a list `1 -> 2 -> 3 -> 4 -> 5` and `k = 2`:

- The `k`-th node from the beginning is `2`.
- The `k`-th node from the end is `4`.
- Swapping these nodes results in the list `1 -> 4 -> 3 -> 2 -> 5`.
