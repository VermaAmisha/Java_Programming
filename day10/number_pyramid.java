package day10;

// To print the following pattern:
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5

public class number_pyramid {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            // number --> print row no. , row no. times
            for(int k = 1; k <= i ; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
