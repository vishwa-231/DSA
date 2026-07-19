package conditional;

import java.util.Scanner;

public class ReversalOfNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long temp = num;
        long rem = 0, result_num = 0;
        String result = "";

//        This method uses string value to append the result
//        while(num>0){
//            rem = num%10;
//            num = num/10;
//            result += String.valueOf(rem);
//        }
//        long res = Long.parseLong(result);

        while(num>0){
            rem = num%10;
            num = num/10;
            result_num = (result_num * 10) + rem;
        }

        System.out.println("Reversal of a number "+temp+" is "+result_num);
    }
}
