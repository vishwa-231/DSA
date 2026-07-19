package conditional;

import java.util.Scanner;

// Need to find the nth number in the fibonacci series
public class Fibonacci {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a =0, b =1, c = a+b;
        for(int i=2;i<=n;i++){
            c = a+b;
            a=b;
            b=c;
        }

        System.out.println(c);
    }
}
