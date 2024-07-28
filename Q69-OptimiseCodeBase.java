You and your friend are working on optimizing your company's codebase. To make your task more enjoyable, you decide to play a game with a string of code s. The rules of the game are as follows: You start the game by removing any non-empty substring from s that contains an odd number of vowels (a, e, i, o, u). Your friend then takes their turn by removing any non-empty substring from s that contains an even number of vowels. The game is played in turns until one of you cannot make a valid move. The player who cannot make a move loses the game. Both you and your friend always play optimally, meaning you always make the best possible move to increase your chances of winning.

Input Format

First line of input contains T- number of test cases. Each test case contains a string.

Constraints

1<=T<=100, 1<=length of string <=10000

Output Format

if you win the game then print YES otherwise NO.

Sample Input 0

2
cipherschools
bbcd
Sample Output 0

YES
NO
  /*import java.util.Scanner;

public class VowelGame {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countVowels(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean canWin(String s) {
        int n = s.length();
        int vowelCount = countVowels(s);

        if (vowelCount % 2 != 0) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i)) && (i == 0 || !isVowel(s.charAt(i - 1)))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (canWin(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
*/
