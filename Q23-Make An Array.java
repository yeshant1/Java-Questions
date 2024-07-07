You are given number n. Make an array assuming the index starts from 1. Array of i is Cipher if i is divisible by 3 and 5. Array of i is Schools if i is divisible by 3. Array of i is CipherSchools if the above condition does not match.

Input Format

First line of input contains T- number of test cases. Each test case contains n.

Constraints

1<=T<=100, 1<=n<=1000

Output Format

Print the array of string.

Sample Input 0

3
3
5
8
Sample Output 0

CipherSchools CipherSchools Schools 
CipherSchools CipherSchools Schools CipherSchools CipherSchools 
CipherSchools CipherSchools Schools CipherSchools CipherSchools Schools CipherSchools CipherSchools
 /*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            String[] result = generateArray(n);

            // Print the result for the current test case
            for (int i = 0; i < result.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result[i]);
            }
            System.out.println();
        }

        scanner.close();
    }

    private static String[] generateArray(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "Cipher";
            } else if (i % 3 == 0) {
                result[i - 1] = "Schools";
            } else {
                result[i - 1] = "CipherSchools";
            }
        }

        return result;
    }
}*/
