package Random;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
         char[] s = {'h', 'e', 'l', 'l', 'o'};

         reverseString(s);

    }
    public static  void reverseString(char[] s){
        int start = 0;
        int end = s.length-1;
        while (start<end){
            char temp = s[start];
            s[start]= s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));

    }
}
