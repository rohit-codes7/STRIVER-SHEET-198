package Recursion;

import java.util.*;

public class Partition_Palindrome {
    public static void main(String[] args) {
        String s ="aab";
        System.out.println(partition(s));

    }

        public static List<List<String>> partition(String s) {
            List<List<String>> res = new ArrayList<>();
            List<String> list = new ArrayList<>();
            partition(0, s, list, res);
            return res;
        }

        private  static void partition(int idx, String s, List<String> list, List<List<String>> res) {
            if (idx == s.length()) {
                res.add(new ArrayList<>(list));
                return;
            }
            for (int i = idx; i < s.length(); i++) {
                if (isPalindrome(s, idx, i)) {
                    list.add(s.substring(idx, i + 1));
                    partition(i + 1, s, list, res);
                    list.remove(list.size() - 1);
                }
            }
        }

        private static boolean isPalindrome(String s, int st, int end) {
            while (st < end) {
                if (s.charAt(st) != s.charAt(end)) return false;
                st++;
                end--;
            }
            return true;
        }
    }


