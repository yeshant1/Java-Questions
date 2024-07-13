Today is your friend's birthday and you and your friend decide to distribute candies. You bought n candies and you have to distribute them to k children. But your friend is happy if the given condition is satisfied. 𝑏−𝑎≤1 (it means 𝑏=𝑎 or 𝑏=𝑎+1); the number of kids who has 𝑎+1 candies (note that 𝑎+1 not necessarily equals 𝑏) does not exceed ⌊𝑘/2⌋ (less than or equal to ⌊𝑘/2⌋).

Input Format

First line of input contains T- number of test cases. Each test case contains N- number of candies and k - number of children.

Constraints

1<=T<=100, 1<=N, k,<=1000000

Output Format

Print the maximum number of candies distributed.

Sample Input 0

5
5 2
19 4
12 7
6 2
100000 50010
Sample Output 0

5
18
10
6
75015
  /*import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int k = scanner.nextInt();
            
            int a = N / k;
            int remainder = N % k;
            int half_k = k / 2;
            
            // Number of children who will get a+1 candies
            int aPlusOneChildren = Math.min(remainder, half_k);
            int maxCandiesDistributed = a * k + aPlusOneChildren;
            
            System.out.println(maxCandiesDistributed);
        }

        scanner.close();
    }
}
*/
