package Recursion;
import java.util.*;

public class Combination_Sum_II {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates,target,curr,result,0);
        return result;

    }

    public static void solve(int[]candidates,int target,List<Integer>curr,List<List<Integer>> result,int idx){
        if (target<0){
            return;
        }
        if ((target==0)){
            result.add(new ArrayList<>());
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            curr.add(candidates[i]);
            solve(candidates,target-candidates[i],curr,result,i+1);
            curr.remove(candidates[i]);

        }
    }
}
