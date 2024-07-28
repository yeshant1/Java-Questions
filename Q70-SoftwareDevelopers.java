You and your friend are software developers working at a tech company, and during your lunch break, you decide to play a game with a binary string. Here are the rules for the game: You are given a binary string s. You can perform the following operation on the string any number of times: Choose any index i from the string where i + 1 < s.length such that s[i] == '1' and s[i + 1] == '0'. Move the character s[i] to the right until it reaches the end of the string or another '1'. For example, for s = "010010", if you choose i = 1, the resulting string will be s = "000110".

Input Format

First line of input contains T- number of test cases. Each test case contains a string.

Constraints

1<=T<=100, 1<= size of string <=10000

Output Format

Print maximum number of operations required.

Sample Input 0

2
1001101
00111
Sample Output 0

4
0

  /*import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Process each test case
        while (t-- > 0) {
            String s = scanner.nextLine();
            int n = s.length();
            int cnt = 0, ans = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ans += cnt;
                    while (i < n && s.charAt(i) != '1') {
                        i++;
                    }
                }
                cnt++;
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}*/
