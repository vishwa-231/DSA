package Functions;

public class referenceObject {
    public static void main(String[] args){
        String s = "vishwa";
        int[] arr = {3, 5, 7, 10, 12};
        changeString(s);
        System.out.println("Memory of variable s is "+Integer.toHexString(System.identityHashCode(s)));
        changeArray(arr);
        System.out.println(s);
        System.out.println(arr[0]);
        /*
        Here the String value doesn't got changed but the array value got changed. In method other than primitive data
        types, the reference of the object is passed to the method, so if we change the value of the object in the
        method it'll change the value of the object in the main method also.

        But it doesn't got changed for String type is because. String objects are immutable in java. So that when
        s = "ravi" is triggered, the memory reference of the variable s is changed to the new String object "ravi"
        and the old String object "vishwa" is still in the memory.
         */
    }

    public static void changeString(String s){
        s = "ravi";
    }

    public static void changeArray(int[] arr){
        arr[0] = 25;
    }
}
