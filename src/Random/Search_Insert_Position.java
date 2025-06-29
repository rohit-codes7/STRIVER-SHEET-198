package Random;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int []  nums = {1,3,5,6};
        int target =  5;
        System.out.println(searchInsert(nums,target));

    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target)  right = mid-1;
            else left = mid+1;
        }
        return left;

    }
}
