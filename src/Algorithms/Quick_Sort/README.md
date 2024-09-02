# QuickSort Algorithm

## Approach

QuickSort is a divide-and-conquer sorting algorithm. The basic idea is to select a `pivot` element from the array and partition the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

### Steps:

1. **Choose a Pivot**: Typically, the last element of the array segment is chosen as the pivot.
2. **Partition**: Reorder the array so that all elements with values less than the pivot come before the pivot, and all elements with values greater than the pivot come after it.
3. **Recursively Apply**: Apply the same process to the sub-arrays formed by dividing the array around the pivot.
