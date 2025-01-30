package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    //    public static int[] twoSum(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//        while (start < end) {
//            int sum;
//            sum = nums[start] + nums[end];
//            if (sum == target) {
//                return new int[]{start, end};
//            } else if (sum < target) start++;
//            else end--;
//
//
//        }
//        return new int[]{};
//    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            else map.put(nums[i], i);
        }
        return new int[]{};
    }
}