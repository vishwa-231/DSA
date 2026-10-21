package recursion;

public class isArraySortedUsingRecursion {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6, 8, 34, 9, 11};
        System.out.println(isArrayIsSorted(arr));
    }

    public static boolean isArrayIsSorted(int[] arr){
        return isSorted(arr, 0);
    }

    public static boolean isSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index+1]<arr[index])?false:isSorted(arr, index+1);
    }
}