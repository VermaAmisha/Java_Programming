package day5;

public class do_while {
    public static void main(String args[]) {
        int i = 0;
        // first the work is done and then the condition is checked
        // it is used when the user wants the code to execute at least once
        do {
            System.out.println(i);
            i = i + 1;
        }

        while(i < 11);
        
    }
}
