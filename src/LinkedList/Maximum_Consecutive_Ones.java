package LinkedList;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            if (nums[i]==0) sum = 0;
            max = Math.max(sum,max);
        }

        return max;
    }

//    public int findMaxConsecutiveOnes(int[] nums) {
//        int count = 0;
//        int max = 0;
//        for (int val : nums) {
//            if (val == 1) {
//                count++;
//            } else {
//                max = Math.max(max, count);
//                count = 0;
//            }
//        }
//        return Math.max(count, max);
//    }
}
