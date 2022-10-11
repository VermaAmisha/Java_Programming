package day8;

// To print the following pattern
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

public class inverted_number_pyramid {
    public static void main(String args[]) {
        int j = 1;
        for(int i = 5 ; i >= j ; i--) {
            for(int k = 1 ; k <= i ; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

