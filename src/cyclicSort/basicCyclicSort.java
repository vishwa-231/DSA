package cyclicSort;

import java.util.Arrays;

public class basicCyclicSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
