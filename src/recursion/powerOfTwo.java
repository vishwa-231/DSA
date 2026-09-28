package recursion;

//https://leetcode.com/problems/power-of-two/submissions/2124983559/
public class powerOfTwo {
    public static void main(String[] args){
        int n = 128;
        boolean result = isPowerOfTwo2(n);
        System.out.println(result);
    }

    // This got solved using Bit Manipulation using Math
    public static boolean isPowerOfTwo2(int n){
        return n>0 && Integer.bitCount(n) == 1;
    }

    // Manually done using recursion
    public static boolean isPowerOfTwo(int n) {
        return (n==1)?true:((n%2)!=0)? false : isPowerOfTwo(n/2);
    }
}
