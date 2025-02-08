package Random;


public class Remove_Duplicate {
    public static void main(String[] args) {
        int [] nums ={1,1,2};
        System.out.println(removeDuplicates(nums));


    }
    public  static int removeDuplicates(int[] nums) {

        if (nums.length==0) return 0;
        // Two pointers

        int i =1 ;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }

        }

        return i;
    }
}
