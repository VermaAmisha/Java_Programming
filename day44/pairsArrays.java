package day44;

public class pairsArrays {
    public static void pairs(int numbers[]) {
        for(int i = 0 ; i < numbers.length ; i++){
            // 2, 4, 6, 8, 10
            int current = numbers[i];
            for(int j = i + 1 ; j < numbers.length ; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        int numbers[] = {2 , 4 , 6 , 8 , 10};
        pairs(numbers);
    }
}
