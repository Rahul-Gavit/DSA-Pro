package Arrays.Maximum_SubArray_Sum;

public class MaximumSubArray {

    public static void maximumSubArray(int arr[]) { // O(n^3)
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println();
                max = Math.max(max, currSum);
            }
            System.out.println();
        }
        System.out.println("Maximum sum of subArray is " + max);
    }

    public static void kadanes(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int cs = 0;
        int max = arr[0]; // Initialize max with the first element

        for (int i = 0; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            // Choose between starting a new subArray or extending the current subArray

            max = Math.max(max, cs); // Update max with the highest sum found
        }

        System.out.println("Maximum sum of subArray is " + max);
    }

    public static void main(String[] args) {
        int arr[] = { -6, -2, -5, -12 };
        // maximumSubArray(arr);
        kadanes(arr);
    }
}
