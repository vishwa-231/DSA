package array;

public class Basic {
    public static void main(String[] args){
        int[] arr = new int[3];
        int[] arr2 = {3, 5, 7, 8, 10};
        String[] names = {"Ramesh", "Suresh", "Rakesh", "Vijay", "Vishwa"};
        for (int num : arr2){
            System.out.println(num);
        }
        for(String name : names){
            System.out.println(name);
        }
//        arr = {3, 4, 0b110};
    }
}
