package Array;

import java.util.HashSet;

public class Duplicate_Numbers {
    public static void main(String[] args) {
        int [] nums ={3,1,3,4,2};
        System.out.println(findDuplicate(nums));

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
}
