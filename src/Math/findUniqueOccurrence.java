package Math;

import java.util.ArrayList;
import java.util.List;

public class findUniqueOccurrence {
    public static void main(String[] args){
        int arr[] = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(findXor(arr)+" is the unique number");
    }

    public static int findXor(int[] arr){
        int unique=0;
        for(int num : arr){
            unique^=num;
        }
        return unique;
    }

    public static int bruteForceApproach(int[] arr){
        List<Integer> uniqueIntegers = new ArrayList<>();
        for(int number : arr){
            if(uniqueIntegers.contains(number)){
                uniqueIntegers.remove(uniqueIntegers.indexOf(number));
            }else{
                uniqueIntegers.add(number);
            }
        }
        return uniqueIntegers.get(0);
    }
}