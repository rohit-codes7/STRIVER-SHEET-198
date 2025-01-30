package Array;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        merge(arr1,3,arr2,3);



    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i  =m-1;
       int j = n-1;
       int k = m+n-1;
       while(j>=0){

           if (i>=0 && nums1[i]> nums2[j]){
               nums1[k--] = nums1[i--];

           }
           else{
               nums1[k--] = nums2[j--];
           }

       }
        System.out.println(Arrays.toString(nums1));

    }
}