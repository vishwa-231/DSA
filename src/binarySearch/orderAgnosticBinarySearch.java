package binarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16};
        System.out.println(isElementPresent(arr, -2));
    }

    public static int isElementPresent(int[] arr, int target){
        int start = 0, end = arr.length-1, mid = 0, index = -1;
        boolean isAsc = arr[end] > arr[start];
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if((isAsc && arr[mid] < target) || (!isAsc && arr[mid] > target)){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}