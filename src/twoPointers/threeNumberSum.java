package twoPointers;

import java.sql.Array;
import java.util.*;

public class threeNumberSum {
    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new LinkedHashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int num = nums[i]+nums[left]+nums[right];
                if(num==0){
                    resultSet.add(List.of(nums[i], nums[left], nums[right]));
                    left++;right--;
                }else if(num > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
