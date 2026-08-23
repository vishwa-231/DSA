package bubbleSort;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
public class sortColors {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int length = nums.length;
        for(int i=0;i<nums.length;i++,length--){
            boolean isSwap = false;
            for(int j=1;j<length;j++){
                if(nums[j]<nums[j-1]){
                    isSwap = true;
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }
}
