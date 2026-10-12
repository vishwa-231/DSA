package Math;

public class findithBit {
    public static void main(String[] args){
        System.out.println(findBit(14, 5));
    }

    public static int findBit(int n, int i){
        return (n>>(i-1))&1;
    }
}
