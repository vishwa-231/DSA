package recursion;

public class powerOfThree {
    public static void main(String[] args){
        System.out.println(isPowerOfThree(-23));
    }

    public static boolean isPowerOfThree(int n){
        if(n==1){
            return true;
        }else if(n<=0){
            return false;
        }
        return (n%3==0)?isPowerOfThree(n/3):false;
    }
}