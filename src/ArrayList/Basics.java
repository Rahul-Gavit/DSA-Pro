package ArrayList;

import java.util.*;

public class Basics {

    // Write a Java program to create an ArrayList of integers and add 10 elements
    // to it. Then, print all the elements.

    public static void printNumbers(int num) { // Time Complexity: O(n) Space Complexity: O(1)

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
    public static int largestString(int num) { // Time Complexity: O(n) Space Complexity: O(1)
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

    public static void reverseList(ArrayList<String> list) { // Time Complexity: O(n) Space Complexity: O(1)
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

    // Write a method to remove all occurrences of a given element from an
    // ArrayList.

    public static void removeDuplicates(ArrayList<Integer> num) { // Time Complexity: O(n^2) Space Complexity: O(1)
        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(i) == num.get(j)) {
                    num.remove(j);
                }
            }
        }
    }

    // Write a program to find the maximum and minimum values in an ArrayList of
    // integers.

    public static void maxAndMin(ArrayList<Integer> num) { // Time Complexity: O(n) Space Complexity: O(1)
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > max) {
                max = num.get(i);
            } else if (num.get(i) < min) {
                min = num.get(i);
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void sortStringList(ArrayList<String> list) { // Time Complexity: O(n^2) Space Complexity: O(1)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        // printNumbers(10);

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Mango");

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(1);

        // System.out.println(largestString(5));

        // System.out.println("Original List: " + list);
        // reverseList(list);
        // System.out.println("Reversed List: " + list);

        // System.out.println("Original List: " + num);
        // removeDuplicates(num);
        // System.out.println("List after removing duplicates: " + num);

        // maxAndMin(num);

        // System.out.println("Original List: " + list);
        // sortStringList(list);
        // System.out.println("Sorted List: " + list);

    }
}