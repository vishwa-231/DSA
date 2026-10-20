package recursion;

public class palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(276));
    }

    public static boolean isPalindrome(int n){
        return n==reverseRecursion(n);
    }

    public static int reverseRecursion(int x){
        long temp = Math.abs((long)x);
        long num = temp/10;
        if(x/10==0){
            return x;
        }
        boolean isNegative = x<0 ? true : false;
        int multiplier = 10;
        while(num>=10){
            multiplier *= 10;
            num /= 10;
        }
        long result = (isNegative?-1:1)*(((temp%10)*multiplier)+reverseRecursion((int)temp/10));
        return ((result > Integer.MAX_VALUE) || (result < Integer.MIN_VALUE))?0:(int)result;
    }
}