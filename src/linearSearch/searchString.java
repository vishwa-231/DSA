package linearSearch;

public class searchString {
    public static void main(String[] args){
        String s = "";
        char c = 'z';
        System.out.println(searchCharInString(s, c));
    }

    public static boolean searchCharInString(String str, char c){
        char[] charArr = str.toCharArray();
        for(char character : charArr){
            if(character == c){
                return true;
            }
        }
        return false;
    }
}
