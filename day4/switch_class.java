package day4;
import java.util.*;

public class switch_class {
    public static void main(String args[]) {
        // withot using switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Press any button from 1 to 3: " );
        int button = sc.nextInt();
        
        // if only one statement is related to if/else if/else then no curly braces are required

        // if(button == 1)
        //     System.out.println("Hello!");

        // else if(button == 2)
        //     System.out.println("Namaste!");

        // else if(button == 3)
        //     System.out.println("Bonjour!");

        // else
        //     System.out.println("Invalid button");


        // using switch

        switch(button) {

            case 1 : System.out.println("Hello!");
            break;

            case 2 : System.out.println("Namaste!");
            break;

            case 3 : System.out.println("Bonjour!");
            break;

            default : System.out.println("Invalid button");
        }
    }
}
