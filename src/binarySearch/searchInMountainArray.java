package binarySearch;

//https://leetcode.com/problems/find-in-mountain-array/submissions/2075195037/
public class searchInMountainArray {
    interface MountainArray{
        public int get(int index);
        public int length();
    }
    public static void main(String[] args){

        // Example usage
        MountainArray mountainArr = new MountainArray() {
            private int[] arr = {0,1,2,4,2,1};

            @Override
            public int get(int index) {
                return arr[index];
            }

            @Override
            public int length() {
                return arr.length;
            }
        };

        int target = 3;
        int result = search(mountainArr, target);
        System.out.println("Index of target " + target + ": " + result);
    }

    public static int search(MountainArray mountainArr, int target) {
        int peak = findPeak(mountainArr);
        int left = binarySearch(mountainArr, 0, peak, target, true);
        if(left != -1){
            return left;
        }
        return binarySearch(mountainArr, peak + 1, mountainArr.length() - 1, target, false);
    }

    public static int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(MountainArray mountainArr, int start, int end, int target, boolean isAsc){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(isAsc){
                if(mountainArr.get(mid) < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(mountainArr.get(mid) > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
