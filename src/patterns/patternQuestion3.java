package patterns;

//5.  *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
public class patternQuestion3 {
    public static void main(String[] args){
        printPattern(20);
    }

    public static void printPattern(int n){
        int col = 2*n;
        for(int i=1;i<col;i++){
            int num = (i>n) ? --n : i;
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
