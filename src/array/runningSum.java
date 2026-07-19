package array;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class runningSum {
    public static void main(String[] args){
        int[] arr = {1,4, 5, 6};
        runningSum(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] runningSum(int[] nums) {
        int[] temp = nums;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i] = sum+=temp[i];
        }
        return nums;
    }
}
