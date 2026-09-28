package recursion;

//https://www.geeksforgeeks.org/dsa/recursive-program-prime-number/
public class primeNumber {
    public static void main(String[] args){
        int n = 11;
        System.out.println(isPrimeNumber(n, n-1));
    }

    public static boolean isPrimeNumber(int n, int num){
        if(num==1){
            return true;
        }
        return (n%num==0)?false:isPrimeNumber(n, --num);
    }
}
