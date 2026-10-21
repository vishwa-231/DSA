package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class linearSearchRecursion {
    public static void main(String[] args){
        int[] arr = {67, 3, 2, 67, 45, 67, 10, 22, 67};
        int target = 67;
        System.out.println(getTargetOccurrences2(arr, target, arr.length-1));
    }

    public static int searchTarget(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        return (arr[index]==target)?index:searchTarget(arr, target, index+1);
    }

    public static ArrayList<Integer> getTargetOccurrences(int[] arr, int target, int index, ArrayList<Integer> result){
        if(index==arr.length){
            return result;
        }else if(arr[index]==target){
            result.add(index);
        }
        return getTargetOccurrences(arr, target, ++index, result);
    }

    // Returning ArrayList without passing it as an Argument
    public static ArrayList<Integer> getTargetOccurrences2(int[] arr, int target, int index){
        if(index==-1){
            return new ArrayList<>();
        }
        ArrayList<Integer> result = getTargetOccurrences2(arr, target, index-1);
        if(arr[index]==target) {
            result.add(index);
        }
        return result;
    }
}
