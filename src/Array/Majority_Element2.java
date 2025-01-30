package Array;

import java.util.*;

public class Majority_Element2 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        System.out.println(majorityElement(nums));


    }

    public static List<Integer> majorityElement(int[] nums) {
        // Boyer-More Voting Algorithm

        int majority1 = 0;
        int majority2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majority1) {
                count1++;
            } else if (nums[i] == majority2) {
                count2++;

            } else if (count1 == 0) {
                majority1 = nums[i];
                count1 = 1;

            } else if (count2 == 0) {
                majority2 = nums[i];
                count2 = 1;

            } else {
                count1--;
                count2--;
            }
        }

        // Verification
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        count1 = 0;
        count2 = 0;

        for (var num : nums) {
            if (num == majority1) count1++;
            else if (num == majority2) count2++;
        }
        if (count1 > threshold) result.add(majority1);
        if (count2 > threshold) result.add(majority2);

        return result;
    }
}
