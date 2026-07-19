package Functions;

import java.util.Scanner;

/*

An Armstrong number (or narcissistic number) is an integer where the sum of its digits,
each raised to the power of the total number of digits, equals the number itself

3 digits: 153, 370, 371, 407
4 digits: 1634, 8208, 9474
7 digits: 1741725

 */
public class armstrong {
    public static void main(String[] args){
        for(int i=1000;i<10000;i++){
            if(isArmstrong(i)){
                System.out.println(i+" is Armstrong");
            }
        }
    }

    public static boolean isArmstrong(int n){
        int temp = n, r = 0, sum = 0;
        int size = String.valueOf(n).length();
        while(n>0){
            r = n%10;
            n = n/10;
            sum += Math.pow(r,size);
        }
        return sum==temp;
    }
}
