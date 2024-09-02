package Algorithms.Merge_Sort;

// Approach:
// TC => O(nlogn) SC => (n)
// -> Divide the array into 2 parts till the single element present
// -> Conquer the divided elements into sorted order

import java.util.*;

public class MergeSort {

    private static void merge(int[] arr, int si, int mid, int ei) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = si; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= ei) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left //
        while (right <= ei) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = si; i <= ei; i++) {
            arr[i] = temp.get(i - si);
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left half
        mergeSort(arr, mid + 1, ei); // right half
        merge(arr, si, mid, ei); // merging sorted halves
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 2, 9, 3 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
