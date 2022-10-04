package day3;
import java.util.*;

public class if_else_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        if(num % 2 == 0) {
            System.out.println("It is an even number.");
        }
        else {
            System.out.println("It is an odd number.");
        }
    }
        
}
