package recursion;

public class binarySearchUsingRecursion {
    public static void main(String[] args){
        int[] arr = {4, 6, 8, 10, 12, 15};
        int target = 10;
        System.out.println(binarySearch(arr, 0, arr.length-1, target));
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            end--;
        }else{
            start++;
        }
        return binarySearch(arr, start, end, target);
    }
}
