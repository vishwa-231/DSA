package array;

import java.util.Arrays;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class rotationMatrix {
    public static void main(String[] args){
        int[][] mat = {{0,0,0}, {0,1,0}, {1,1,1}};
        int[][] target = {{1,1,1}, {0,1,0}, {0,0,0}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean sameArray = false;
       if(Arrays.deepEquals(mat, target)){
           return true;
       }else{
           for(int i=0;i<4;i++){
               mat = rotate(mat);
               if(Arrays.deepEquals(mat, target)){
                   sameArray = true;
                   break;
               }
           }
       }
       return sameArray;
    }

   public static int[][] rotate(int[][] arr){
        int length = arr.length;
        int[][] ans = new int[length][length];
        for(int i=0;i<arr.length;i++){
            for(int j=0,index=(arr.length-1);j<arr.length;j++,index--){
                ans[i][j] = arr[index][i];
            }
        }
        return ans;
   }
}
