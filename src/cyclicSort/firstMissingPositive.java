package cyclicSort;

//https://leetcode.com/problems/first-missing-positive/submissions/2113216080/
public class firstMissingPositive {
    public static void main(String[] args){
        int[] arr = {5, -5, -1, 3, 2, 1};
//        int[] arr = {0, 2, 2, 1, 1};
        int missingPositive = firstMissingPositive(arr);
        System.out.println(missingPositive);
    }

    public static int firstMissingPositive(int[] nums) {
        quickSort(nums);
        int missingPositive = 1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==missingPositive){
                missingPositive++;
            }
        }
        return missingPositive;
    }

    public static void quickSort(int[] nums){
        for(int i=0;i<nums.length;){
            int first = nums[i];
            if(first > 0 && first < nums.length){
                int second = nums[nums[i] - 1];
                if(first==second){
                    i++;
                }else{
                    nums[i] = second;
                    nums[first - 1] = first;
                }
            }else{
                i++;
            }
        }
    }

    public static void bubbleSort(int[] nums){
        int last = nums.length;
        for(int i=0;i<nums.length;i++){
            boolean swapMade = false;
            for(int j=1;j<last;j++){
                if(nums[j]<nums[j-1]){
                    swapMade = true;
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(!swapMade){
                break;
            }
            last--;
        }
    }

    public static int getFirstPositiveIndexUsingBinarySearch(int[] arr){
        int result = arr[arr.length-1];
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]<=0){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
