package binarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/2073208732/
public class smallestLetterGreaterThanTarget {
    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1, mid = 0;
        if(target >= letters[end]){
            return letters[0];
        }
        while(start<=end){
            mid = (start+end) / 2;
            if((letters[mid] == target) || (letters[mid] < target)){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return letters[start];
    }
}
