package Functions;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args){
        test(1,2,3,4,5);
        test(1,2);
        test(1);
        test();
    }

    public static void test(int ...v){
        System.out.println(Arrays.toString(v));
    }
}