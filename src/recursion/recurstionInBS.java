package recursion;

public class recurstionInBS {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 9, 12, 14};
        int target = 4;
        int index = findIndex(arr, 0, arr.length - 1, target);
        System.out.println(index);
    }

    public static int findIndex(int[] arr, int start, int end, int target) {
        int mid = (start+(end-start)/2);
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return findIndex(arr, mid + 1, end, target);
        }
        return findIndex(arr, start, mid - 1, target);
    }
}