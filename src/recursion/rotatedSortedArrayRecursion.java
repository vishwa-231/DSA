package recursion;

public class rotatedSortedArrayRecursion {
    public static void main(String[] args){
        int[] arr = {15, 16, 19, 20, 22, 3, 7, 8, 9, 10, 11, 12};
        int target = 22;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        // If the portion from start to mid is in ascending order
        if(arr[start] <= arr[mid]){
            // Check whether the target is available in the ascending order
            if((target >= arr[start]) && (target <= arr[mid])) {
                return binarySearch(arr, target, start, mid - 1);
            }else {
                /* As the number is not in that ascending order check that in another half of array
                where pivot exists */
                return binarySearch(arr, target, mid+1, end);
            }
        }

        /* As the portion from start to mid is not in ascending order, check for target in next half of
           array which must be in ascending order */
        if((target >= arr[mid]) && (target <= arr[end])) {
            return binarySearch(arr, target, mid+1, end);
        }
        /* As the target is not available in the second half sorted portion the target check for the
            target in first half where the pivot exists */
        return binarySearch(arr, target, start, mid-1);
    }
}