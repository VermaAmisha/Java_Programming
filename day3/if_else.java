package day3;
import java.util.*;

public class if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age to know if you are an adult: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Adult");
        } 

        else {
            System.out.println("Not Adult");
        }
    }
}
