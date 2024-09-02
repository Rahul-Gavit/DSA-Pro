# MergeSort Algorithm

## Approach

MergeSort is a divide-and-conquer algorithm that sorts an array by recursively splitting it into halves, sorting each half, and then merging the sorted halves. Here's a step-by-step approach:

1. **Divide**: Split the array into two halves.
2. **Recursively Sort**: Apply MergeSort recursively to each half.
3. **Merge**: Merge the two sorted halves to produce the sorted array.

### Merge Function

The `merge` function combines two sorted sub-arrays into a single sorted array. It does the following:

1. **Merge Process**:
   - Use two pointers to traverse the left and right sub-arrays.
   - Compare elements from both sub-arrays and add the smaller element to a temporary array.
   - Copy any remaining elements from both sub-arrays to the temporary array.
   - Copy the sorted elements back to the original array.
