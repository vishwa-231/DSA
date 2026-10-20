package recursion;

//https://leetcode.com/problems/powx-n/submissions/2130212555/
public class power {
    public static void main(String[] args){
        double x = 1.00000;
        int n = -2147483648;
        double result = myPow(x, n);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }

    // My POV Code
//    public static double myPow(double x, int n) {
//        if(n==0){
//            return 1;
//        }
//        if(n<0){
//            return 1 / myPow(x, -n);
//        }
//        if(n%2==0){
//            return myPow(x*x, n/2);
//        }
//        return x * myPow(x*x, (n-1)/2);
//    }
}
