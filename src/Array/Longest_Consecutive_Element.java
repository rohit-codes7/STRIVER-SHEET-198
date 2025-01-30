package Array;

import java.util.HashSet;
import java.util.Set;


public class Longest_Consecutive_Element {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums2));

    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (var num : nums) {
            set.add(num);
        }
        for (var it : set) {
            // chech if it is the first element
            if (!set.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);

            }

        }
        return longest;

    }
}