package linearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class searchIn2dArray {
    public static void main(String[] args){
        int[][] arr = {{4, 89, 23}, {32, 0, 98}, {23, 11, 89, 5}};
        int[][] indeces = searchElementIn2dArr(arr, 3);
        System.out.println(Arrays.deepToString(indeces));
    }

    public static int[][] searchElementIn2dArr(int[][] arr, int target){
        List<int[]> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    ans.add(new int[]{i,j});
                }
            }
        }
        int[][] ansArr = new int[ans.size()][];
        int index=0;
        for(int[] ansArray : ans){
            ansArr[index] = ansArray;
            index++;
        }
        return ansArr;
    }
}
