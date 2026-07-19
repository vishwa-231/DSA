package conditional;

import java.util.Scanner;

// Find the number of occurrences of a number in the given input number
public class NumberOccurrences {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long temp = n;
        int num = in.nextInt();
        int count =0;
        long s=0;
        while(n>0){
            s=n%10;
            n=n/10;
            if(s==num){
                count++;
            }
        }
        System.out.println("Number of occurrences of the number "+num+" in "+temp+" is "+count);
    }
}
