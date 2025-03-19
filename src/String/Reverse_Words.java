package String;

public class Reverse_Words {
    static String reverseWords(String s){
        String [] words = s.split("\\s+"); // "\\s+" -> handle one or more spaces, new lines and tab , " +" -> this handle only one or more spaces.
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            sb.append(words[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String s1 = " hello world ";
        System.out.println(reverseWords(s1));

    }
}
