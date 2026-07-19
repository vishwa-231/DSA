package array;

import java.util.Arrays;

public class concatenation {
    public static void main(String[] args){
        int[] arr = {2,43, 3, 5, 6};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int final_length = 2*length, index=0;
        int[] ans = new int[final_length];
        for(int i=0;i<final_length;i++,index++){
            if(index==nums.length)
                index=0;
            ans[i] = nums[index];
        }
        return ans;
    }
}
