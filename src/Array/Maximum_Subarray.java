package Array;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));


    }

    // BETTER APPROACH
//    public static int maxSubArray(int[] nums){
//        int maxSub =0;
//        int sum = 0;
//        // make two loops and iterate from i to end -> j to end
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                maxSub=Math.max(sum,maxSub);
//
//
//            }
//            sum=0;
//
//
//        }
//        return maxSub;
//    }
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}
