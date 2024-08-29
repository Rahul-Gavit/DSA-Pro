package Stack.Hard.Largest_Rectangle_In_Histogram;

import java.util.Stack;

public class LargestRectangle {

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] nsr = new int[heights.length];
        int[] nsl = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        // Next Smaller Right (NSR)
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length; // No smaller element to the right
            } else {
                nsr[i] = s.peek(); // Index of the next smaller element to the right
            }
            s.push(i);
        }

        s = new Stack<>();

        // Next Smaller Left (NSL)
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // No smaller element to the left
            } else {
                nsl[i] = s.peek(); // Index of the next smaller element to the left
            }
            s.push(i);
        }

        // Calculate area
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 4 };
        System.out.println(largestRectangleArea(heights));
    }
}
