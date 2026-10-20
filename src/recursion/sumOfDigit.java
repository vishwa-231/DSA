package recursion;

//https://www.geeksforgeeks.org/dsa/sum-digit-number-using-recursion/
public class sumOfDigit {
    public static void main(String[] args){
        int num = 1342;
        System.out.println(sumOfDigits2(num));
    }

    public static int sumOfDigits(int n){
        if(n/10==0){
            return n%10;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int sumOfDigits2(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits2(n/10);
    }
}