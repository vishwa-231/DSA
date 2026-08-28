package patterns;

//17.      1
//        212
//       32123
//      4321234
//       32123
//        212
//         1
public class patternQuestion5 {
    public static void main(String[] args){
        printPattern(8);
    }

    public static void printPattern(int n){
        int length = 2*n;
        for(int i=1;i<length;i++){
            int spaces = (i>n) ? i-n : n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            int nums = (i>n) ? ((2*(n-spaces))-1) : ((2*i)-1);
            for(int j=1;j<=nums;j++){
                int num = (i>n) ? (n-spaces-j+1) : i-j+1;
                System.out.print(((num<=0)?((i>n)?(j-n+spaces+1):(j-i+1)):num)+" ");
            }
            System.out.println();
        }
    }
}
