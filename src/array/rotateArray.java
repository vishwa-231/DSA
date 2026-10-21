package array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args){
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        rotate(num, 3);
        System.out.println(Arrays.toString(num));
    }

    public static void rotate(int[] nums, int k){
        int[] result = new int[nums.length];
        if(k>=nums.length){
            k = (k%nums.length);
        }
        for(int i=0,n=k;i<nums.length;i++,n++){
            result[n] = nums[i];
            if(n==nums.length-1){
                n=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = result[i];
        }
    }
}