package Math;

public class findXorOfNos {
    public static void main(String[] args){
        int num = 8;
        findXor(num);
    }

    public static void findXor(int num){
        for(int i=0;i<=num;i++){
            int result = (i%4==0)?i:(((i+3)%4==0)?1:(((i+2)%4==0)?(i+1):0));
            System.out.println(i+" "+result);
        }
    }
}
