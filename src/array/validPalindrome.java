package array;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "0PP";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean isPalindrome = true;
        int start = 0, end = s.length()-1;
        while(start<end){
            while(start<end && !isValidCharacter(s.charAt(start))){
                ++start;
            }
            while(start<end && !isValidCharacter(s.charAt(end))){
                --end;
            }
            if(isValidCharacter(s.charAt(start)) && isValidCharacter(s.charAt(end)) && s.charAt(start)!=s.charAt(end)){
                return false;
            }
            ++start;
            --end;
        }
        return isPalindrome;
    }

    public static boolean isValidCharacter(char ch){
        return (ch>=97 && ch<=122);
    }
}