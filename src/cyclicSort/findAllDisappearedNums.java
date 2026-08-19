package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/2097362381/
public class findAllDisappearedNums {
    public static void main(String[] args){
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers2(arr);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (final int num : nums) {
            final int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        for (int i = 0; i < nums.length; ++i)
            if (nums[i] > 0)
                ans.add(i + 1);

        return ans;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;){
            if(nums[i]==i+1 || nums[i]==-1){
                i++;
            }else if(nums[i]!=(i+1) && nums[nums[i]-1]!=nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }else if(nums[nums[i]-1]==nums[i]){
              nums[i] = -1;
              i++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1){
                result.add(i+1);
            }
        }
        return result;
    }
}
