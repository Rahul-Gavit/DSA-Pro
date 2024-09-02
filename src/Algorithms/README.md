# Sorting Algorithms Overview

This document provides a concise summary of commonly asked sorting algorithms, including key steps and insights for each.

## 1. Bubble Sort

**Steps:**

1. **Compare**: Compare each pair of adjacent elements.
2. **Swap**: Swap if the first element is greater than the second.
3. **Repeat**: Continue until no swaps are needed (array is sorted).

**Key Insight**: Larger elements "bubble up" to their correct position in each pass.

---

## 2. Selection Sort

**Steps:**

1. **Find Minimum**: Find the minimum element in the unsorted portion.
2. **Swap**: Swap it with the first unsorted element.
3. **Repeat**: Move the boundary of the sorted portion to the right and repeat.

**Key Insight**: Each pass selects the smallest element and moves it to the beginning.

---

## 3. Insertion Sort

**Steps:**

1. **Pick**: Pick the next element to be inserted.
2. **Compare & Shift**: Compare it with elements in the sorted portion and shift elements as needed to make room.
3. **Insert**: Place the picked element in its correct position.

**Key Insight**: Builds the sorted array one element at a time by inserting elements into their correct position.

---

## 4. Merge Sort

**Steps:**

1. **Divide**: Recursively divide the array into two halves until each half contains a single element.
2. **Conquer**: Merge sorted halves to produce a sorted array.
3. **Combine**: Combine (merge) two sorted halves into a single sorted array.

**Key Insight**: Utilizes divide-and-conquer to sort and then merges sorted subarrays.

---

## 5. Quick Sort

**Steps:**

1. **Choose Pivot**: Select a pivot element from the array.
2. **Partition**: Rearrange the array so that elements less than the pivot are on the left, and elements greater than the pivot are on the right.
3. **Recursively Sort**: Recursively apply the same process to the left and right subarrays.

**Key Insight**: Partitions the array around a pivot and recursively sorts the partitions.

---

## 6. Heap Sort

**Steps:**

1. **Build Heap**: Convert the array into a max-heap (for ascending order) or min-heap (for descending order).
2. **Extract Max/Min**: Remove the root of the heap (the largest or smallest element) and place it at the end of the array.
3. **Heapify**: Rebuild the heap and repeat until all elements are sorted.

**Key Insight**: Utilizes a heap data structure to sort elements.

---

## 7. Counting Sort

**Steps:**

1. **Count Occurrences**: Count the number of occurrences of each distinct element.
2. **Compute Positions**: Compute the position of each element in the output array based on the count.
3. **Place Elements**: Place elements in the output array at the computed positions.

**Key Insight**: Counts occurrences to determine the position of each element in the sorted array.

---

## 8. Radix Sort

**Steps:**

1. **Sort by Digit**: Sort the numbers based on each digit (starting from the least significant digit to the most significant).
2. **Use Stable Sort**: Use a stable sort (like Counting Sort) for each digit place.
3. **Repeat**: Repeat for each digit position.

**Key Insight**: Uses multiple passes of a stable sort to order numbers by their digits.

---

## 9. Bucket Sort

**Steps:**

1. **Create Buckets**: Divide the range of the input data into a fixed number of buckets.
2. **Distribute**: Place each element into the appropriate bucket.
3. **Sort Buckets**: Sort each bucket individually (using another sorting algorithm).
4. **Concatenate**: Concatenate the sorted buckets to get the final sorted array.

**Key Insight**: Distributes elements into buckets and sorts each bucket individually.
