package Math;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class factors {
    public static void main(String[] args){
        System.out.println(getFactors(20));
    }

    public static List<Integer> getFactors(int num){
        List<Integer> factors = new ArrayList<>();
        int n=1;
        while(n*n<=num){
            if(num%n==0){
                factors.add(n);
                factors.add(num/n);
            }
            n++;
        }
        factors.sort(Comparator.naturalOrder());
        return factors;
    }
}