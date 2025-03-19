package String;

public class Palindromic_Substring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println((longestPalindrome(s)));

    }

    public static String longestPalindrome(String s) {
        int maxLen=0, start = 0, end = 0;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindromic(s, i, j) ) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                        end = j;

                    }

                }

            }


        }
        return s.substring(start, end+1); // here startingIndex + maxLen because in substring method that end range is inclusive
    }

    private static boolean isPalindromic(String str, int s, int e) {
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
