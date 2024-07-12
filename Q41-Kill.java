One day, Ram went to Rohan and said "Let's solve a gym contest!". Rohan didn't want to do that, as he was playing Valorant, so he came up with a problem and told it to Ram to distract him. Sadly, Ram can't solve it... Could you help him? There is an Agent in Valorant, and he has 𝑛 weapons. The 𝑖-th weapon has a damage value 𝑎𝑖, and the Agent will face an enemy whose health value is 𝐻. The Agent will perform one or more moves until the enemy dies. In one move, he will choose a weapon and decrease the enemy's health by its damage value. The enemy will die when his health will become less than or equal to 0.However, not everything is so easy: the Agent can't choose the same weapon for 2times in a row. What is the minimum number of times that the Agent will need to use the weapons to kill the enemy?

Input Format

First line of input contains T- number of test cases. Each test case contains n and H. The next line contains an array of size n.

Constraints

1<=T<=100, 1<=n<=1000,

Output Format

Print single integer.

Sample Input 0

3
2 4
3 7
2 6
4 2
3 11
2 1 7
Sample Output 0

1
2
3
  /*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        List<int[]> testCases = new ArrayList<>();

        // Reading all test cases
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // number of weapons
            int H = scanner.nextInt(); // initial health of enemy
            int[] weapons = new int[n];
            for (int i = 0; i < n; i++) {
                weapons[i] = scanner.nextInt();
            }
            testCases.add(new int[]{n, H, weapons});
        }

        // Processing each test case
        for (int[] testCase : testCases) {
            int n = testCase[0];
            int H = testCase[1];
            int[] weapons = testCase[2];

            // DP array to store minimum moves required to achieve health i
            int[] dp = new int[H + 1];
            Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with a large number
            dp[0] = 0; // 0 moves needed to have zero health

            // Iterate through each weapon
            for (int damage : weapons) {
                // Update dp array from right to left to avoid reusing the same weapon consecutively
                for (int i = H; i >= damage; i--) {
                    if (dp[i - damage] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - damage] + 1);
                    }
                }
            }

            // Minimum moves required to kill enemy with health H
            System.out.println(dp[H]);
        }

        scanner.close();
    }
}
*/
