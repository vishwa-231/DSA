package Functions;

public class shadowing {
    static int a = 40;
    public static void main(String[] args){
        int a = 20;
        System.out.println(a);
        for(int i=0;i<=1;i++){
            /*
            This declaration is forbidden, because java doesn't allows to create local variable with same
            name twice, but the variable declared in line number 6 is actually means "Shadowing" the variable
            declared in line number 4, so it is allowed to create a local variable with same name
            as long as it is not in the same scope.. "Shadowing" means the local variables the overlaps the
            scope of the class variable
             */
//            int a = 50;
            a = 45;
            int b = 37;
        }
        System.out.println(a);
        /*
        Here we can't access the variable b because it is declared inside the for loop and
        it is not accessible outside the for loop. Also the variable "a" got the value changed inside for loop is
        because in for loop it just changes the value in the same memory reference
         */
//        System.out.println(b);
        test();
    }

    public static void test(){
        System.out.println(a);
    }
}
