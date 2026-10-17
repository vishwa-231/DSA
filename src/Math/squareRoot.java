package Math;

public class squareRoot {
    public static void main(String[] args){
        System.out.printf("%.3f", findSquareRoot(84, 3));
    }

    public static double findSquareRoot(int num, int position){
        int start = 0, end = num;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(mid*mid == num){
                return (double)mid;
            }else if(mid*mid < num){
                start = mid+1;
            }else if(mid*mid > num){
                end = mid-1;
            }
        }
        double newEnd = (double)end;
        for(int i=1;i<=position;i++){
            double fraction = 1/Math.pow(10,i);
            double number = newEnd+fraction;
            while(number*number<num){
                number += fraction;
            }
            if(number*number == num){
                return number;
            }else{
                number -= fraction;
            }
            newEnd = number;
        }
        return newEnd;
    }
}