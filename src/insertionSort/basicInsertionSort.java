package insertionSort;

import java.util.Arrays;

public class basicInsertionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,4,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else if(arr[j]>arr[j-1]){
                    break;
                }
            }
        }
    }
}