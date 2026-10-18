package Math;

public class gcd {
    public static void main(String[] args){
        System.out.println(findGcd(48, 48));
    }

    public static int findGcd(int num1, int num2){
        if(num1==0){
            return num2;
        }
        return findGcd(num2%num1, num1);
    }
}
