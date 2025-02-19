package Recursion;
import java.util.*;
public class Subset_II {
   static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args){
        int [] nums ={1,2,2};
        System.out.println(subsetsWithDup(nums));

    }

    public static   List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,0,temp);
        return result;


    }
    private  static void backtrack (int [] nums, int idx, List<Integer> temp ){
        result.add(new ArrayList<>(temp));
        for(int i = idx ; i<nums.length;i++){
            if(i>idx && nums[i]== nums[i-1]) continue;


            temp.add(nums[i]);
            backtrack(nums,i+1,temp);
            temp.remove(temp.size()-1);

        }
    }



}
