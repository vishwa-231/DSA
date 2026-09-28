package recursion;

public class lengthOfString {
    public static void main(String[] args){
        String str = "VISHWA";
        int length = recLen(str);
        System.out.println(length);
    }

    public static int recLen(String str) {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
}