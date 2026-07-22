package binarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/2075227788/
public class searchInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {4, 5, 5, 7, 8, 8, 2, 2, 3, 3, 3};
        int noOfTimesRotated = findPeak(nums);
        System.out.println("The array rotated "+(noOfTimesRotated+1)+ "times");
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int peakIndex = findPeak(nums);
        int result = binarySearch(nums, 0, peakIndex,target);
        if(result!=-1){
            return result;
        }
        return binarySearch(nums, peakIndex+1, nums.length-1, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target){
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int findPeak(int[] nums){
        int start=0, end = nums.length-1, mid=0;
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid]<nums[0]){
                end = mid;
            }else if(nums[mid+1]>nums[0]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
