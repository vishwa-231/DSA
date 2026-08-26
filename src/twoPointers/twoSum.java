package twoPointers;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class twoSum {
    public static void main(String[] args){
        int[] arr = new int[]{3,3};
        int target = 6;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{};
        HashMap<Integer, Integer> numberAndIndices = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int number = target-nums[i];
            if(numberAndIndices.containsKey(number)){
                return new int[]{numberAndIndices.get(number), i};
            }else{
                numberAndIndices.put(nums[i], i);
            }
        }
        return result;
    }
}