package Math;

public class findMagicNumber {
    public static void main(String[] args){
        System.out.println(magicNumber2(1));
    }

    public static int magicNumber2(int n){
        int result = 0;
        int base = 5;
        while(n>0){
            int last = n&1;
            result += last*base;
            n = n>>1;
            base *= 5;
        }
        return result;
    }

    public static int magicNumber(int n){
        int result = 0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                result += Math.pow(5, (i+1));
            }
        }
        return result;
    }
}
