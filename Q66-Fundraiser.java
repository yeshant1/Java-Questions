Alice and Bob are organizing a charity fundraiser. They have a limited number of special donation coins to distribute to participants. There are two types of coins: gold coins worth 75 units each and silver coins worth 10 units each. Game Rules: The game starts with Alice, and they take turns picking up coins. On each turn, a player must pick coins with a total value of exactly 115 units. If a player cannot pick coins that total 115 units on their turn, they lose the game. Given the number of gold coins (x) and silver coins (y) they have, determine which player will win if both Alice and Bob play optimally.

Input Format

First line of input contains T number of test cases. Each test case contains two integers x and y.

Constraints

1<=T<=100, 1<=x,y<=100

Output Format

Print name of player who wins the game.

Sample Input 0

2
4 11
2 7
Sample Output 0

Bob
Alice

  /*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FundraiserGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int goldCoins = scanner.nextInt();
            int silverCoins = scanner.nextInt();

            ArrayList<Integer> coins = new ArrayList<>();
            for (int i = 0; i < goldCoins; i++) {
                coins.add(75);
            }
            for (int i = 0; i < silverCoins; i++) {
                coins.add(10);
            }
            Collections.sort(coins, Collections.reverseOrder());

            boolean aliceTurn = true;
            while (!coins.isEmpty()) {
                int target = 115;
                for (int i = 0; i < coins.size(); i++) {
                    if (coins.get(i) <= target) {
                        target -= coins.get(i);
                        coins.remove(i);
                        i--;
                    }
                }
                if (target != 0) {
                    aliceTurn = !aliceTurn;
                    break;
                }
                aliceTurn = !aliceTurn;
            }

            System.out.println(aliceTurn ? "Alice" : "Bob");
        }
    }
}*/

  
