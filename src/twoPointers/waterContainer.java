package twoPointers;

//https://leetcode.com/problems/container-with-most-water/description/
public class waterContainer {
    public static void main(String[] args){
        int[] arr = {120,120,6,2,5,4,8,3,7};
        int sum = maxArea(arr);
        System.out.println(sum);
    }

    public static int maxArea(int[] height) {
        int sum = 0;
        int left = 0, right = height.length-1;
        while(left<right){
            int num = ((height[left]>=height[right])?height[right]:height[left])*(right-left);
            if(num > sum){
                sum = num;
            }
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return sum;
    }
}
