package Array;

public class Majority_Element {
    public static void main(String[] args) {
        int [] nums ={3,2,3};
        System.out.println(majorityElement(nums));

    }
    public  static  int majorityElement(int[] nums){
        int majority = nums[0];
        int votes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (votes==0){
                votes=1;
                majority = nums[i];
            } else if (majority==nums[i]) {
                votes++;

            }else{
                // if the next element is different
                votes--;
            }
        }
        return majority;

    }
}
