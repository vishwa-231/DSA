package selectionSort;

import java.util.Arrays;

public class basicSelectionSort {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int length = arr.length;
        for(int i=arr.length-1;i>=0;i--){
            int largest = arr[0], largestIndex = 0;
            for(int j=0;j<length;j++){
                if(arr[j]>largest){
                    largest = arr[j];
                    largestIndex = j;
                }
            }
            length--;
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
