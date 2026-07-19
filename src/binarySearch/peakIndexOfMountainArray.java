package binarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/2073489241/
public class peakIndexOfMountainArray {
    public static void main(String[] args){
        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1, mid =0;
        while(start<end){
            mid = (start+end) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
