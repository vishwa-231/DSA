package binarySearch;

//https://leetcode.com/problems/find-the-duplicate-number/
/*
Here we should consider this case as cyclic linked list and by using Floyd's algorithm we can get the
repeated value in the array.

i.e., slow and fast pointers where slow pointer moves one index and fast pointer moves 2 indices
 */
public class findDuplicate {
    public static void main(String[] args){
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        int slow2=0;
        do{
            slow=nums[slow];
            slow2=nums[slow2];
        }while(slow!=slow2);
        return slow;
    }
}
