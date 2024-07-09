You are watching a robowars fest at your college and you want their is no winner in robowars.
There are n bots fighting in the arena. Initially, the 𝑖-th bots has 𝑎i health points. The fight in the arena takes place in several rounds. At the beginning of each round, each alive bot deals 1damage to all other bots. Hits of all bots occur simultaneously. bots whose health is less than 1at the end of the round are considered killed. If exactly 1 bot remains alive after a certain round, then it is declared the winner. Otherwise, there is no winner. Your task is to calculate the number of ways to choose the initial health points for each bot 𝑎𝑖, where 1≤𝑎𝑖≤𝑥, so that there is no winner of the fight. The number of ways can be very large, so print it modulo 998244353. Two ways are considered different if at least one bot has a different amount of health. For example, [1,2,1] and [2,1,1] are different.

Input Format

The only line contains two integers 𝑛 and 𝑥 .

Constraints

2≤𝑛≤500 , 1≤𝑥≤500

Output Format

Print one integer — the number of ways to choose the initial health points for each bot 𝑎𝑖, where 1≤𝑎𝑖≤𝑥, so that there is no winner of the fight, taken modulo 998244353.
  /*import java.util.*;

public class RoboWars {
    static final int MOD = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int n = scanner.nextInt(); // number of bots
        int x = scanner.nextInt(); // maximum initial health any bot can have
        
        // Calculate the result
        long result = solve(n, x);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
    
    public static long solve(int n, int x) {
        // dp[i][j] will store the number of ways to distribute i health points among j bots
        long[][] dp = new long[(n + 1) * x + 1][n + 1];
        
        // Base case: There is one way to distribute 0 health points among 0 bots
        dp[0][0] = 1;
        
        // Fill the dp table
        for (int i = 0; i <= (n + 1) * x; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= x; k++) {
                    if (i + k <= (n + 1) * x) {
                        dp[i + k][j] = (dp[i + k][j] + dp[i][j - 1]) % MOD;
                    }
                }
            }
        }
        
        // Sum up dp[i][n] for i from 1 to n * x
        long totalWays = 0;
        for (int i = 1; i <= (n + 1) * x; i++) {
            totalWays = (totalWays + dp[i][n]) % MOD;
        }
        
        return totalWays;
    }
}
*/
