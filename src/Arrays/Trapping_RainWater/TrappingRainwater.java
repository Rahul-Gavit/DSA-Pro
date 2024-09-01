package Arrays.Trapping_RainWater;

public class TrappingRainwater {

    public static int trappedWater(int height[]) {
        int maxLeft[] = new int[height.length];
        maxLeft[0] = height[0];

        // Calculating leftMax
        for (int i = 1; i < maxLeft.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        int maxRight[] = new int[height.length];
        maxRight[height.length - 1] = height[height.length - 1];

        // calculating rightMax
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        // calculating trapped water
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(height));
    }
}
