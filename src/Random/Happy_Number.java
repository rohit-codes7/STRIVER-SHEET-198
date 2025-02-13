package Random;

public class Happy_Number {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {
//        input : 19
//        1^2 + 9^2 = 82
//        8^2 + 2^2 = 68
//        6^2 + 8^2 = 100
//        1^2 + 0^2 + 0^2 = 1
        if (n == 1 ) return true;
        else if (n < 10) return false;
        else {
            int sqr = 0;
            while (n > 0) {
                int digits = n % 10;
                sqr += digits * digits;
                n /= 10;

            }
        return isHappy(sqr);
        }

    }
}
