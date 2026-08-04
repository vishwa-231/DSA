package bubbleSort;

import java.util.Arrays;

public class simpleBubbleSort {
    public static void main(String[] args){
        int[] arr = {-1, 0, -32, 87, 2, -42};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int length = arr.length;
        boolean isSwapMade;
        do{
            isSwapMade = false;
            for(int i=1;i<length;i++){
                if(arr[i]<arr[i-1]){
                    isSwapMade = true;
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            length--;
        }while(isSwapMade);
    }
}