package switchcase;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        switch (name){
            case "Vijay" ->System.out.println("He is the CM of tamilnadu");
            case "Ajith" -> System.out.println("He is full focused on racing now");
            case "Suriya" -> System.out.println("He has delivered a massive blockbuster karuppu");
        }
    }
}
