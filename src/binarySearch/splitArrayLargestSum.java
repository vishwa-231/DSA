package binarySearch;

//https://leetcode.com/problems/split-array-largest-sum/submissions/2082687263/
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/submissions/2084107162/

// Above both leetcode share same results and explanations
public class splitArrayLargestSum {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }

    public static int splitArray(int[] nums, int k) {
        int[] startAndEnd = startAndEndIndices(nums);
        int start = startAndEnd[0], end = startAndEnd[1], mid = startAndEnd[0];
        while(start<end){
            mid = (start+end)/2;
            int partitionCount = getNumberOfPartitions(nums, mid);
            if(partitionCount<=k){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    public static int getNumberOfPartitions(int[] nums, int limit){
        int count =1, sum=0, temp=0;
        for(int num:nums){
            temp = sum+num;
            if(temp<=limit){
                sum = temp;
            }else{
                sum=num;
                count++;
            }
        }
        return count;
    }

    public static int[] startAndEndIndices(int[] arr){
        int sum=0,largest=arr[0];
        for(int num : arr){
            sum+=num;
            if(num>largest){
                largest=num;
            }
        }
        return new int[]{largest, sum};
    }
}
