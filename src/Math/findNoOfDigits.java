package Math;

public class findNoOfDigits {
    public static void main(String[] args){
        int num = 43;
        int base = 2;
        int digits = (int)(Math.log(num)/Math.log(base))+1;
        System.out.println(digits);
    }
}