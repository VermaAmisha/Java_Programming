package day7;

// wap to print the following pattern:
// *
// **
// ***
// ****

public class pattern_3 {
    public static void main(String args[]) {
        int j = 4;
        for(int i = 1 ; i <= j ; i++) {
            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
