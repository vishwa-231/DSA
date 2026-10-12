package Math;

public class findPositionOfRightMostSetBit {
    public static void main(String[] args){
        System.out.println(findSetBit(512));
    }

    public static int findSetBit(int n){
        int i=0;
        while(((n>>i)&1)!=1){
            i++;
        }
        return i+1;
    }
}
