package Random;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(plusOne(nums)));

    }

    public static int[] plusOne(int[] digits) {


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;

    }

}
