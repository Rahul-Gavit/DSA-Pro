// Bubble Sort is a simple comparison-based sorting algorithm. 
// It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. 
// This process is repeated until the list is sorted.

package Algorithms.Bubble_Sort;

public class BubbleSort {

    public static void bubbleSort(int arr[]) { // O(n^2)
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
