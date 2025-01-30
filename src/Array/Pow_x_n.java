package Array;

public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2.0,10));

    }
    public static double myPow(double x, int n){
        int m = n ;
        double ans = 1;
        while(n>0){
            if(n%2==1){
                ans = ans*n;
                n =n-1;
            }
            else{
                n = n/2;
                n = n*n;
            }
            if(m<0){
                ans = 1/ans;
            }
        }
        return ans;
    }

}
