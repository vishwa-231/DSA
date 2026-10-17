package Math;

import java.util.Arrays;

public class flippingImage {
    public static void main(String[] args){
        int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipImage(arr)));
    }

    public static int[][] flipImage(int[][] image){
        int size = image.length;
        for(int i=0;i<size;i++){
            int firstIndex = 0, lastIndex = size-1;
            while(firstIndex<=lastIndex){
                int temp = image[i][firstIndex];
                image[i][firstIndex] = image[i][lastIndex]^1;
                image[i][lastIndex] = temp^1;
                firstIndex++;
                lastIndex--;
            }
        }
        return image;
    }
}
