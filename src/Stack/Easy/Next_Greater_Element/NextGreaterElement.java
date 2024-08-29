package Stack.Easy.Next_Greater_Element;

import java.util.*;

public class NextGreaterElement {

    public static void nextGreaterElement(int arr[], int nextGreater[]) {

        Stack<Integer> s = new Stack<>();

        // travel backward on array
        for (int i = arr.length - 1; i >= 0; i--) {

            // step 1: loop until stack not empty && current Element greater and equal then
            // stack top element

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step 2: If stack empty nextGreater -1 else nextGreater stack top element

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // step3: push next element on stack

            s.push(i);
        }

    }

    public static void nextGreaterElm(int num1[], int num2[]) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();

        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[num1.length];

        for (int i = num2.length - 1; i >= 0; i--) {

            int num = num2[i];
            while (!s.isEmpty() && s.peek() <= num) {
                s.pop();
            }

            // step 2: If stack empty nextGreater -1 else nextGreater stack top element

            if (s.isEmpty()) {
                // nextGreater[i] = -1;
                nextGreaterMap.put(num, -1);
            } else {
                // nextGreater[i] = num2[s.peek()];
                nextGreaterMap.put(num, s.peek());
            }

            // step3: push next element on stack

            s.push(num2[i]);
        }

        for (int i = 0; i < num1.length; i++) {
            nextGreater[i] = nextGreaterMap.get(num1[i]);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];
        int num1[] = { 4, 1, 2 };
        int num2[] = { 1, 3, 4, 2 };
        nextGreaterElm(num1, num2);

        nextGreaterElement(arr, nextGreater);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
