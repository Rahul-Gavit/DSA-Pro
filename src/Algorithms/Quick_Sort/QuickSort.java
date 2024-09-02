package Algorithms.Quick_Sort;

public class QuickSort {

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            // swapping all smaller elements in left side
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swapping pivot in actual place
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;

    }

    public static void quickSort(int arr[], int si, int ei) { // Average Case O(nLogN)
        if (si < ei) {
            int pi = partition(arr, si, ei);
            quickSort(arr, si, pi - 1);
            quickSort(arr, pi + 1, ei);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
