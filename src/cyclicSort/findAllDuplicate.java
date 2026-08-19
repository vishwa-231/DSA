package cyclicSort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicate {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans =  findDuplicates(arr);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<nums.length;){
            int first = nums[i];
            int second = nums[nums[i]-1];
            if(first == i+1 || second == first){
                i++;
            }else{
                nums[i] = second;
                nums[first-1] = first;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                duplicates.add(nums[i]);
            }
        }
        return duplicates;
    }
}
