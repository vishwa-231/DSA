package Math;

public class lcm {
    public static void main(String[] args){
        System.out.println(findLcm(34, 54));
    }

    public static int findLcm(int a, int b){
        int d = findGcd(a,b);
        return (a/d)*(b/d)*d;
    }

    public static int findGcd(int a, int b){
        if(a==0){
            return b;
        }
        return findGcd(b%a, a);
    }
}
