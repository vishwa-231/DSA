package Functions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
