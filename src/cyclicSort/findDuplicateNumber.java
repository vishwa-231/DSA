package cyclicSort;

public class findDuplicateNumber {
    public static void main(String[] args){
        int[] arr = {3,1,3,4,2};
        int duplicate = findDuplicate2(arr);
        System.out.println(duplicate);
    }

    public static int findDuplicate2(int[] arr){
        int slow = arr[arr[0]];
        int fast= arr[arr[arr[0]]];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static int findDuplicate(int[] arr){
        for(int num : arr){
            int index = Math.abs(num)-1;
            if(arr[index]<0){
                return Math.abs(num);
            }else{
                arr[index] = -Math.abs(arr[index]);
            }
        }
        return -1;
    }
}