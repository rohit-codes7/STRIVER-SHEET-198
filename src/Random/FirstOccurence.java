package Random;

public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "Leetcode";
        String needle = "Leet";
        System.out.println(strStr(haystack,needle));

    }
    public static int strStr(String haystack, String needle){
        if (haystack.indexOf(needle)==-1) return -1;
        else{
            return haystack.indexOf(needle);
        }


    }
}
