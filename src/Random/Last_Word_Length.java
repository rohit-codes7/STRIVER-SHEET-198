package Random;

public class Last_Word_Length {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        int end = s.length()-1;
        while(end>=0 && s.charAt(end) == ' '){
            end--;

        }
        int start = end;
        while(start>=0 && s.charAt(start)!= ' '){
            start--;
        }
        return end - start;


    }
}
