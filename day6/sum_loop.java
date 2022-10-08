package day6;
import java.util.*;

public class loop_sum {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = 0;
        for(int i = 1 ; i <= n ; i++) {
             j = j + i;
        }
        System.out.println(j);
    }
}
