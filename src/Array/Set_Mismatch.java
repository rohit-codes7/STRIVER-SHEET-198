package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Set_Mismatch {
    public static void main(String[] args) {
        int [] nums ={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public  static int[] findErrorNums(int[] nums){


        return new int[]{findDuplicate(nums),findMissing(nums)};


    }
    public static int findDuplicate(int[] nums){
        // this has linear time complexity but taking extra spaces
        HashSet<Integer> result = new HashSet<>();
        int ans = 0;
        for(var i:nums){
            if(result.contains(i)){
                ans = i;
                break;
            }
            else {
                result.add(i);
            }

        }
        return ans;
    }
    static int findMissing(int[]nums){
        int n = nums.length;
        int Allsum  = n*(n+1)/2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        sum = sum - findDuplicate(nums);
        return Allsum-sum;

    }
}
