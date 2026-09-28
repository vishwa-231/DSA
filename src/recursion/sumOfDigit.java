package recursion;

//https://www.geeksforgeeks.org/dsa/sum-digit-number-using-recursion/
public class sumOfDigit {
    public static void main(String[] args){
        int num = 45632;
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int n){
        if(n/10==0){
            return n%10;
        }
        return n%10 + sumOfDigits(n/10);
    }
}