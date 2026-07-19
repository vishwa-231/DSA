package binarySearch;

public class PositionInInfiniteSortedArray {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(findPositionInInfiniteSortedArray(arr, 10));
    }

    public static int findPositionInInfiniteSortedArray(int[] arr, int target){
        int[] position = getStartAndEndIndex(arr, target);
        int start = position[0], end = position[1], mid = 0;
        while(start<=end){
            mid = (start+end) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int[] getStartAndEndIndex(int[] arr, int target){
        int start = 0, end = 1, size = 1;
        while(arr[end] < target){
            start = end;
            size *= 2;
            end +=  size;
        }
        return new int[] {start, end};
    }
}
