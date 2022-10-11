package day8;

// To print the following pattern
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class number_pyramid {
    public static void main(String args[]) {
        int j = 5;
        for(int i = 1 ; i <= j ; i++) {
            for(int k = 1 ; k <= i ; k++) {
                // " " <- to print space between numbers
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
