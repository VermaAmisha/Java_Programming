package day6;
import java.util.*;

public class tables {
    public static void main(String args[]) {
        System.out.println("To get the table of any number till its 10th time.");
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++) {
            int table = num * i ;

            System.out.println(num + " * " + i + " = " + table);
        }
    }
}
