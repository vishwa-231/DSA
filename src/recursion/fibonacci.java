package recursion;

public class fibonacci {
    public static void main(String[] args){
//        int sum = fibonacci(50);
        System.out.println(fibonacci(3));
        System.out.println(fiboFormula(4));
    }

    public static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
