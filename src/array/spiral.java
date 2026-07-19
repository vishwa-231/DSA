package array;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-ii/submissions/2059934153/
public class spiral {
    public static void main(String[] args){
        int[][] ans = generateMatrix(6);
        for(int[] arr : ans){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int rowStart = 0, rowEnd = (n-1), colStart = 0, colEnd = (n-1);
        int num = 1;
        while(rowEnd>=rowStart && colEnd>=colStart){
            for(int i=colStart;i<=colEnd;i++){
                ans[rowStart][i] = num;
                num++;
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                ans[i][colEnd] = num;
                num++;
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                ans[rowEnd][i] = num;
                num++;
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                ans[i][colStart] = num;
                num++;
            }
            colStart++;
        }
        return ans;
    }
}
