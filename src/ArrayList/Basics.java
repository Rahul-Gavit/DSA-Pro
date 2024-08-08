package ArrayList;

import java.util.*;

public class Basics {

    // Write a Java program to create an ArrayList of integers and add 10 elements
    // to it. Then, print all the elements.

    public static void printNumbers(int num) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // Write a method that takes an ArrayList of strings and returns the length of
    // the longest string.
    public static int largestString(int num) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        return max;
    }

    // Implement a method that reverses the elements of an ArrayList.

    public static void reverseList(ArrayList<String> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move indices towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // printNumbers(10);
        // System.out.println(largestString(5));

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("Original List: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);
    }
}