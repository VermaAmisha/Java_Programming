public class SetIthBit {
    public static void main(String[] args) {
        int num = 12; // Example number
        int position = 2; // Position of the bit to set (0-based index)

        // Set the ith bit using bitwise OR
        int result = num | (1 << position);

        System.out.println("Original number: " + num);
        System.out.println("Number after setting the " + position + "th bit: " + result);
    }
}
