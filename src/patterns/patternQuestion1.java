package patterns;

//28.      *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
public class patternQuestion1 {
    public static void main(String[] args){
        printPattern2(30);
    }

    public static void printPattern2(int n){
        int length = 2*n;
        int temp = n;
        for(int i=1;i<length;i++){
            int spaces = (i>n) ? (i-n) : (n-i);
            int star = (i>n) ? --temp : i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern(){
        int space = 4, star = 1;
        boolean reverse = false;
        do {
            for (int i = space; i > 0; i--) {
                System.out.print(" ");
            }
            if(reverse){
                space++;
            }else {
                space--;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(reverse) {
                star--;
            }else{
                star++;
            }
            if(space==-1){
                space=1;
                star=4;
                reverse = true;
            }
        } while(space>=0 && star!=0);
    }
}
