package Math;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// This algorithm is called as Sieve of Eratosthenes
public class numberOfPrime {
    public static void main(String[] args){
        int num = 50;
        System.out.println(getPrimeNumbersList(num));

    }

    public static List<Integer> getPrimeNumbersList(int num){
        List<Integer> primeNumbers = new ArrayList<>();
        int[] numbers = new int[num-2];
        for(int i=2;i*i<num;i++){
            if(numbers[i-2]==0 && isPrime(i)){
                int temp_i = 2;
                int temp = i*temp_i;
                while(temp<num){
                    if(numbers[temp-2]==0) {
                        numbers[temp - 2] = 1;
                    }
                    temp_i++;
                    temp = temp_i * i;
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                primeNumbers.add(i+2);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num){
        int c = 2;
        while(c*c <= num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
