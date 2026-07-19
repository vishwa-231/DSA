package binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/2073239882/
public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int startIndex = getIndex(nums, target, true);
        if(startIndex == nums.length || nums[startIndex] != target){
            return new int[]{-1,-1};
        }
        return new int[]{startIndex, getIndex(nums, target, false)};
    }

    public static int getIndex(int[] nums, int target, boolean startIndex){
        int start=0, end = nums.length-1, mid =0;
        while(start<=end){
            mid = (start+end)/2;
            if((startIndex && nums[mid]<target) || (!startIndex && nums[mid]<=target)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return startIndex?start:end;
    }
}
