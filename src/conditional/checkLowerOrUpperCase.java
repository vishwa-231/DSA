package conditional;

import java.util.Scanner;

public class checkLowerOrUpperCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);

        boolean isLowerCase = false;
        if(c >= 'a' && c <= 'z'){
            isLowerCase = true;
        }

        System.out.println(isLowerCase?"LowerCase":"UpperCase");

    }
}
