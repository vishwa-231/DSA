package Math;

public class noOfSetbits {
    public static void main(String[] args){
        int num = 75;
        System.out.println(Integer.toBinaryString(num)+" "+findSetBits2(num));
    }

    public static int findSetBits2(int num){
        int result =0;
        while(num>0){
            System.out.println(Integer.toBinaryString(num)+"  "+Integer.toBinaryString(num & -num));
            result++;
            num = num - (num & -num);
        }
        return result;
    }

    public static int findSetBits(int num){
        int result = 0;
        while(num>0){
            if((num&1)==1){
                result++;
            }
            num >>=1;
        }
        return result;
    }
}
