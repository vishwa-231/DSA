package recursion;

public class fibonacci {
    public static void main(String[] args){
        int sum = fibonacci(50);
        System.out.println(sum);
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
