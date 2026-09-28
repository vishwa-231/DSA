package recursion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/2126716295/
public class stepsToReduceZero {
    public static void main(String[] args){
        int num = 8;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num){
        return (num==0) ? 0 : (1+numberOfSteps((num%2==0)?num/2:--num));
    }
}