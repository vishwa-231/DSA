package cyclicSort;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/
public class missingNumber {
    public static void main(String[] args){
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNumber2(arr));
    }

    // Best Solution
    public static int findMissingNumber2(int[] arr){
        int length = arr.length;
        int actualSum = length * (length+1)/2;
        int foundSum = 0;
        for(int i=0;i<arr.length;i++){
            foundSum+=arr[i];
        }
        return actualSum - foundSum;
    }

    // My Solution
    public static int findMissingNumber(int[] arr){
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
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
        }while(isSwapMade);
    }
}
