package Array;


import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        sortColors(nums);


    }

//    public static void sortColors(int[] nums) {

    /// /        Arrays.sort(nums);
    /// /        System.out.println(Arrays.toString(nums)); Libraries are not allowed in this question.
//        int start   =   0;
//        int middle  =   0; // it will handle the 1's
//        int end     =   nums.length-1;
//        while(middle<=end){
//            if (nums[start]==0)
//            swapNum(nums,start,middle);
//            middle++;
//            start++;
//        }
//        if (nums[middle]==1) {
//            middle++;
//        }
//        if (nums[middle]==2){
//            swapNum(nums,middle,end);
//            end--;
//        }
//        System.out.println(Arrays.toString(nums));
//
//    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int middle = 0;
        int high = nums.length - 1;
        while (middle <= high) {
            if (nums[middle] == 0) {
                swapNum(nums, low, middle);
                {
                    low++;
                    middle++;

                }
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                // if nums[middle]==2
                swapNum(nums, middle, high);

                high--;

            }

        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swapNum(int arr[], int Pos1, int Pos2) {
        int temp = arr[Pos1];
        arr[Pos1] = arr[Pos2];
        arr[Pos2] = temp;
    }
}
