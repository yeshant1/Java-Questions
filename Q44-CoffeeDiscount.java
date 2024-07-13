Your friend goes to buy coffee. At coffee shops there is a special discount but discounts apply if they solve one problem. Problem is given one string and they have to tell which character does not repeat. Your friend is not able to solve this problem and they ask you for help.

Input Format

First line of input contains T- number of test cases. Each test case contains a string.

Constraints

1<=T<=100, 1<=N<=10000

Output Format

Print single character.

Sample Input 0

2
ccipphheerr
scchhoools
Sample Output 0

i
l
  /*import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input
        for (int t = 0; t < T; t++) {
            String str = scanner.nextLine();
            System.out.println(findFirstNonRepeatingCharacter(str));
        }

        scanner.close();
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of one
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a placeholder (this case should not occur as per constraints)
        return '\0';
    }
}
*/
