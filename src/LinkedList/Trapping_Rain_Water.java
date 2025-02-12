package LinkedList;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[]height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 1 || n == 0) return 0;

        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);

        int water = 0;
        for (int i = 0; i <n; i++) {
            water += Math.min(leftMax[i], rightMax[i])-height[i];

        }
        return water;
    }

    private static int[] getLeftMax(int height[], int n) {
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        return leftMax;
    }

    private static int[] getRightMax(int height[], int n) {
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        return rightMax;
    }
}