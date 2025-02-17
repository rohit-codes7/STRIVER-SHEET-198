package Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        System.out.println(ans); // both the output is same, here it will return in the form of arr
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");

    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer>arr,int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        subsetSumHelper(0,0,arr,N,sumSubset);
        return sumSubset;
    }
    static void subsetSumHelper(int idx,int sum, ArrayList<Integer>arr , int N , ArrayList<Integer>sumSubset){
        if(idx==N){
            sumSubset.add(sum);
            return;
        }
        //pick the element
        subsetSumHelper(idx+1,sum+arr.get(idx),arr,N,sumSubset);

        // don't pick the element
        subsetSumHelper(idx+1,sum,arr,N,sumSubset);
    }
}
