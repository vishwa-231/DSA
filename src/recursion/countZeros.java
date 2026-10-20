package recursion;

public class countZeros {
    public static void main(String[] args){
        int num = 30210004;
        System.out.println(countNumberOfZeros(num));
    }

    public static int countNumberOfZeros(int n){
        if(n==0){
            return 0;
        }
        return ((n%10==0)?1:0)+countNumberOfZeros(n/10);
    }
}
