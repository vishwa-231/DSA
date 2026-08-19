package cyclicSort;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/submissions/2112937170/
public class setMismatch {
    public static void main(String[] args){
        int[] nums = {3, 2, 2};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;){
            int first = nums[i];
            int second = nums[nums[i] -1];
            if(first==second){
                i++;
            }else{
                nums[i] = second;
                nums[first-1] = first;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                result = new int[]{nums[i], i+1};
                break;
            }
        }
        return result;
    }
}
