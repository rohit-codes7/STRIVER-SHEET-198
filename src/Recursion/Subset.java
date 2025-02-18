package Recursion;

import java.util.*;

public class Subset {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subsets(nums));

    }

//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> resultList = new ArrayList<>();
//        backtrack(resultList, new ArrayList<>(), nums, 0);
//        return resultList;
//    }
//
//    private static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) {
//        resultSets.add(new ArrayList<>(tempSet));
//        for (int i = start; i < nums.length; i++) {
//            tempSet.add(nums[i]);
//
//            backtrack(resultSets, tempSet, nums, i + 1);
//            tempSet.remove(tempSet.size() - 1);
//
//        }
//    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(nums,0,temp);
        return result;

    }
    private static void solve(int[]nums,int idx, List<Integer> temp){
        if(idx>= nums.length){
            result.add(new ArrayList<>(temp));
            return;

        }
        temp.add(nums[idx]);
        solve(nums,idx+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,idx+1,temp);
    }

}


