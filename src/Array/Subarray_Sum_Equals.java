package Array;

import java.util.Arrays;

public class Subarray_Sum_Equals {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subarraySum(nums, 3));

    }

    public static int subarraySum(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int start = 0;
        int end = nums.length - 1; // End pointer should be at the last index
        int count = 0;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == k) { // Found a valid pair
                count++;
                start++; // Move left pointer forward
                end--;   // Move right pointer backward
            } else if (sum < k) { // Increase sum
                start++;
            } else { // Decrease sum
                end--;

            }
        }
        return count;
    }

}