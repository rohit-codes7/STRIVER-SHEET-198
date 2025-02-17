package Recursion;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subsets(nums));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) {
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);

            backtrack(resultSets, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);

        }
    }
}
