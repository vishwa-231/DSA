package recursion;

public class oneToN {
    public static void main(String[] args){
        printNtoone(5);
        System.out.println();
        printOneToN(5);
    }

    public static void printNtoone(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        printNtoone(n-1);
    }

    public static void printOneToN(int n){
        if(n==0){
            return;
        }
        printOneToN(n-1);
        System.out.print(n+" ");
    }
}