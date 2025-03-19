package StackAndQueue;

public class Next_Greater_Element {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] indexArray = new int[nums2.length];

        // Fill indexArray with indices of nums2 elements
        for (int i = 0; i < nums2.length; i++) {
            indexArray[nums2[i]]=i;
        }
        return indexArray;

    }
}
