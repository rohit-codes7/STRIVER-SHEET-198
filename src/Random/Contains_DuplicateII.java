package Random;

import java.util.HashSet;

public class Contains_DuplicateII {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int [] nums2 = {1,0,1,1};
        int k  = 3 ;
        int k2 = 1;
//        System.out.println(containsNearbyDuplicate(nums,k));
        System.out.println(containsNearbyDuplicate(nums2,k2));

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
//        Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
        int i = 0 ;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j]==nums[i]){
                if (Math.abs(i-j)<=k){
                    return true;
                }
                i++;
            }
            i++;
        }
        return false;
    }
}
