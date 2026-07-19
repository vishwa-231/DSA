package linearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class findNumberOfEvenDigit {
    public static void main(String[] args){
        int[] nums = {102000, 901, 482, 1771};
        System.out.println(findNumbers2(nums));
    }

    public static int findNumbers2(int[] nums){
        int count = 0;
        for(int num : nums){
            if(String.valueOf(num).length() % 2 == 0 ){
                count++;
            }
        }
        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isHavingEvenNumberOfDigits(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean isHavingEvenNumberOfDigits(int n){
        int q = n, r = n, count = 0;
        while(q>0){
            q=n/10;
            r=n%10;
            n/=10;
            count++;
        }
        return count%2==0;
    }
}
