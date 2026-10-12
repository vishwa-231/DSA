package Math;

public class oddOrEven {
    public static void main(String[] args){
        for(int i=1;i<30;i++){
            isOddOrEven(i);
        }
    }

    public static void isOddOrEven(int n){
        if((n&1)==1){
            System.out.println(n+" is Odd");
        }else{
            System.out.println(n+" is Even");
        }
    }
}