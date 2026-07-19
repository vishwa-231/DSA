package binarySearch;

public class ceilingOfSortedArray {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 15, 16, 18};
        int target = 230;
        int resultIndex = getCeilingNumberIndex(arr, target);
        System.out.println(resultIndex==-1?"There is no smallest element in arry that is greater than or equal to " +
                                           target:arr[resultIndex]);
    }

    public static int getCeilingNumberIndex(int[] arr, int target){
        int start = 0, end = arr.length-1, mid = 0;
        if(target > arr[end]){
            return -1;
        }
        // Hello
        while(start <= end){
            mid = start + (end-start) / 2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
