package Math;

public class powOfTwoOrNot {
    public static void main(String[] args){
        for(int i=0;i<34;i++) {
            int num = i;
            boolean isPowerOfTwo = (num<1)?false:((1 << (int) (Math.log(num) / Math.log(2))) & num) == num;
            System.out.println(isPowerOfTwo ? "Yes, " + num + " is power of 2" : "No, " + num + " is not a power of 2");
        }
    }
}