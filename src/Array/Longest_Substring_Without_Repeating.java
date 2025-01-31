package Array;

import java.util.ArrayList;

public class Longest_Substring_Without_Repeating {
    public static void main(String[] args) {
        String s ="abcabccbb";
        System.out.println(longestSubstring(s));

    }
    public static int longestSubstring(String s){
        int start=0, end=0, maxCount=0;

        ArrayList<Character> list = new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxCount = Math.max(maxCount,list.size());

            }
            else{
                list.remove(0);
                start++;
            }

        }
        return maxCount;


    }
}
