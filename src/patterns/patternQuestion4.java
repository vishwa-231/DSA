package patterns;

//30.         1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
public class patternQuestion4 {
    public static void main(String[] args){
        printPattern(9);
    }

    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                int num = i-j+1;
                System.out.print(((num<=0)?(j-i+1):num)+" ");
            }
            System.out.println();
        }
    }
}