package Random;
import java.util.*;

// maintain the streak
public class Fizz_Buzz {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzBuzz(n));

    }
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
