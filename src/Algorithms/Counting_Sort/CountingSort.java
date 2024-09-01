package Algorithms.Counting_Sort;

public class CountingSort {

    public static void countingSort(int arr[]) {
        if (arr.length == 0)
            return;

        // Find the maximum element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array with size largest + 1
        int count[] = new int[largest + 1];

        // Populate the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct the sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5, 1 };
        countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
