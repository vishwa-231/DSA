package array;

import java.util.Arrays;

//https://leetcode.com/problems/reshape-the-matrix/submissions/2059628775/
public class reshapeMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4, 5, 6, 7}, {8}};
        int[][] ans = matrixReshape(arr, 2, 4);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(elementCounts(mat)==(r*c)){
            mat = reshapedMatrix(mat, r, c);
        }
        return mat;
    }

    public static int elementCounts(int[][] mat){
        int size=0;
        for(int i=0;i<mat.length;i++){
            size+=mat[i].length;
        }
        return size;
    }

    public static int[][] reshapedMatrix(int[][] mat, int r, int c){
        int[] arr_1d = changeToSingleton(mat, elementCounts(mat));
        int index=0;
        int[][] ans = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = arr_1d[index];
                index++;
            }
        }
        return ans;
    }

    public static int[] changeToSingleton(int[][] arr, int size){
        int[] ans = new int[size];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[index] = arr[i][j];
                index++;
            }
        }
        return ans;
    }
}
