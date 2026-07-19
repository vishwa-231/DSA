package array;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-iii/submissions/2060715563/
public class spiral_three {
    public static void main(String[] args){
        int[][] ans = spiralMatrixIII(1, 4, 0, 0);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int size = (rows*cols), count=1, incrementValue=1;
        int[][] ans = new int[size][];
        ans[0] = new int[]{rStart, cStart};
        while(count<size){
            for(int i=0;i<incrementValue;i++){
                cStart++;
                if(withinRange(rStart, cStart, rows, cols, count)){
                    ans[count]= new int[]{rStart, cStart};
                    count++;
                }
            }
            for(int i=0;i<incrementValue;i++){
                rStart++;
                if(withinRange(rStart, cStart, rows, cols, count)){
                    ans[count]= new int[]{rStart, cStart};
                    count++;
                }
            }
            incrementValue++;
            for(int i=0;i<incrementValue;i++){
                cStart--;
                if(withinRange(rStart, cStart, rows, cols, count)){
                    ans[count]= new int[]{rStart, cStart};
                    count++;
                }
            }
            for(int i=0;i<incrementValue;i++){
                rStart--;
                if(withinRange(rStart, cStart, rows, cols, count)){
                    ans[count]= new int[]{rStart, cStart};
                    count++;
                }
            }
            incrementValue++;
        }
        return ans;
    }

    public static boolean withinRange(int rowStart, int colStart, int rows, int cols, int count){
        return rowStart>=0 && rowStart<rows && colStart>=0 && colStart<cols && count<=(rows*cols);
    }
}
