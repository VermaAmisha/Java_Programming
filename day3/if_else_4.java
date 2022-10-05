package day3;
import java.util.*;

// another way to solve "if_else_3" program

public class if_else_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number 'x': ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number 'y': ");
        int num2 = sc.nextInt();

        // To check if the first number is = or > or < from the other number

        if(num1 == num2) {
            System.out.println("x = y");
        }

        else {
            if(num1 > num2) {
                System.out.println("x > y");

            }

            else {
                System.out.println("x < y");
            }
        }
    }
}


