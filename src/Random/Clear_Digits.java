package Random;

public class Clear_Digits {

    public static void main(String[] args) {
        String s = "abc1";
        System.out.println(clearDigits(s));


    }

    public static String clearDigits(String s) {


        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }

        return stack.toString();

    }
}