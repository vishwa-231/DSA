package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListExample {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> num = new ArrayList<>();
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        num.add(nums);
//        System.out.println(num);

        for(int i=0;i<=3;i++){
            /*
                This got added because on declaration we just mentioned 2D ArrayList. In order to access the ArrayList
                we should add a empty ArrayList object so that we can use the get(i).add(n) like methods
             */
            num.add(new ArrayList<Integer>());
            for(int j=0;j<=3;j++){
                System.out.print("Enter the number: ");
                int n = in.nextInt();
                num.get(i).add(n);
            }
        }
    }
}
