import java.util.Scanner;

public class FriendsPairing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        int ways = countWays(n);
        System.out.println("Number of ways friends can pair up: " + ways);

        scanner.close();
    }

    // Function to count the number of ways friends can pair up
    static int countWays(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];

        // Base cases
        dp[1] = 1;
        dp[2] = 2;

        // Fill the dp array using the recurrence relation
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        return dp[n];
    }
}
