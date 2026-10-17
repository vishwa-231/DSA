package Functions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        for(int i=2;i<=40;i++){
            if(isPrime2(i)){
                System.out.println(i+" is Prime");
            }
        }
    }

    public static boolean isPrime2(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
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
