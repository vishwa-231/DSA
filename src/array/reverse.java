package array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args){
        int[] arr = {1, 3, 23, 9, 18};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int a = 0, b = arr.length-1;
        while(b>a){
            swap(a, b, arr);
            a++;
            b--;
        }
    }

    public static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
