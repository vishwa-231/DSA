package recursion;

public class reverseInteger {
    public static void main(String[] args){
        System.out.println(reverseRecursion(1234567));
    }

    public static int reverse(int x){
        long result = 0;
        while(x!=0){
            result = ((result*10) + x%10);
            x /= 10;
        }
        return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
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