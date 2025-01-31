package Array;

import java.util.HashMap;



public class Subarray_Sum_Equals {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subarraySum(nums, 3));

    }

    public static int subarraySum(int[] nums, int k) {

//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//                if (k==sum) count++;
//
//            }
//        }
//        return count;
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> sumFrequency = new HashMap<>();

        sumFrequency.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (sumFrequency.containsKey(prefixSum - k)) {
                count += sumFrequency.get(prefixSum - k);
            }

            sumFrequency.put(prefixSum, sumFrequency.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

}