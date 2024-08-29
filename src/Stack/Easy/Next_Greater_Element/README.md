# Next Greater Element Algorithm

## Overview

The `nextGreaterElement` method is designed to find the next greater element for each element in a given array. The next greater element for an element in an array is the first greater element that appears to the right of that element. If there is no greater element, the method returns `-1` for that position.

## Approach

The method utilizes a **stack** to keep track of elements while traversing the array from right to left. This approach ensures that we efficiently determine the next greater element for each position in the array in **O(n)** time complexity.

### Steps

1. **Initialization:**

   - A stack `s` is created to store the indices of the elements in the array.
   - The array is traversed from right to left.

2. **Traversal and Stack Operations:**

   - For each element `arr[i]`, the stack is checked:
     - **Step 1:** While the stack is not empty and the current element `arr[i]` is greater than or equal to the element at the index stored at the top of the stack (`arr[s.peek()]`), pop elements from the stack. This step ensures that only indices of elements larger than the current element are kept in the stack.
     - **Step 2:** If the stack becomes empty, there is no greater element to the right, so `nextGreater[i]` is set to `-1`. Otherwise, the top of the stack contains the index of the next greater element, so `nextGreater[i]` is set to `arr[s.peek()]`.
   - **Step 3:** Push the current index `i` onto the stack.

3. **Result:**
   - After the loop completes, the `nextGreater` array will contain the next greater elements for each corresponding element in `arr`.

### Example

```java
int[] arr = {4, 5, 2, 25};
int[] nextGreater = new int[arr.length];
nextGreaterElement(arr, nextGreater);

// Output: nextGreater = [5, 25, 25, -1]
```
