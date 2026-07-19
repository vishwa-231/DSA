package conditional;

import java.util.List;
import java.util.Scanner;

// Find the largest of three numbers
public class LargestNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        List<Integer> numbers = List.of(a, b, c);
        int largest = a;
        for(int num : numbers){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("Largest number is: " + largest);
    }
}
