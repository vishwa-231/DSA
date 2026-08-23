package bubbleSort;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class moveZeros {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeros2(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Two pointers approach - 2 ms
    public static void moveZeros2(int[] nums){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]= temp;
                left++;
            }
        }
    }

    // Bubble sort approach = 233 ms
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        for(int i=0;i<nums.length;i++,length--){
            for(int j=1;j<length;j++){
                if(nums[j-1]==0){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
