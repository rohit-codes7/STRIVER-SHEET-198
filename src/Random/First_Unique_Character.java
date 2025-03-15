package Random;
import java.util.*;

public class First_Unique_Character {
    public static void main(String[] args) {
        String s = "Leetcode";
        System.out.println(firstUniqChar(s));

    }

        public static int firstUniqChar(String s) {
            char []st = s.toCharArray();
            HashMap<Character,Integer> map = new HashMap<>();
            for( char c:st){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(int i = 0 ; i< st.length;i++){
                if (map.get(st[i])==1){
                    return i;
                }

            }
            return -1;
        }


    }

