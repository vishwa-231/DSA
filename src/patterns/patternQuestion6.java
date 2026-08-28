package patterns;

//31.      4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4
public class patternQuestion6 {
    public static void main(String[] args){
        printPattern(9);
    }

    public static void printPattern(int n){
        int rows = (n*n)-((n-1)*(n-1));
        for(int i=1;i<=rows;i++){
            int temp = n;
            for(int j=1;j<=rows;j++){
                if(i>=(n+1)){
                    if(j>1 && j<=((2*n)-i)){
                        System.out.print(--temp+" ");
                    }else if(j<=i){
                        System.out.print(temp+" ");
                    }else{
                        System.out.print(++temp+" ");
                    }
                }else {
                    if (i > j) {
                        System.out.print(temp-- + " ");
                    } else {
                        if (rows - j + 1 <= i) {
                            System.out.print(temp++ + " ");
                        } else {
                            System.out.print(temp + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}