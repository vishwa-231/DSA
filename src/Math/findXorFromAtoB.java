package Math;

public class findXorFromAtoB {
    public static void main(String[] args){
        int a=3,b=9;
        System.out.println(findXor2(a,b));
    }

    public static int findXor2(int a, int b){
        return findSimpleXor(b)^findSimpleXor(a-1);
    }

    public static int findXor(int a, int b){
        int result = 0;
        for(int i=a;i<=b;i++){
            result ^= i;
        }
        return result;
    }

    public static int findSimpleXor(int num){
        int result = 0;
        for(int i=0;i<=num;i++){
            result = (i%4==0)?i:(((i+3)%4==0)?1:(((i+2)%4==0)?(i+1):0));
        }
        return result;
    }
}