You and your friend are playing a game.You have string1 and your friend has string2 . Your task is to find how many characters of string1 are inside string2 .

Input Format

First line of input contains T- number of test cases. Each test case contains two strings string1 and string2 respectively.

Constraints

1<=T<=100, 1<=length of string1 and string2 <=100

Output Format

Print single integer.

Sample Input 0

2
aA aAAbbbb
z ZZ
Sample Output 0

3
0
/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Process each test case
        for (int t = 0; t < T; t++) {
            String string1 = scanner.next();
            String string2 = scanner.next();

            int count = countCharactersInString(string1, string2);
            System.out.println(count);
        }

        scanner.close();
    }

    private static int countCharactersInString(String string1, String string2) {
        int count = 0;

        // Count occurrences of characters from string1 in string2
        for (char ch : string1.toCharArray()) {
            for (char ch2 : string2.toCharArray()) {
                if (ch == ch2) {
                    count++;
                }
            }
        }

        return count;
    }
}*/
  
