Ronny is working on his new site, and the current challenge is to make the users pick strong passwords. Ronny decided that strong passwords should satisfy the following conditions: password should consist only of lowercase Latin letters and digits; there should be no digit that comes after a letter (so, after each letter, there is either another letter or the string ends); all digits should be sorted in the non-decreasing order; all letters should be sorted in the non-decreasing order. Note that it's allowed for the password to have only letters or only digits. Ronny managed to implement the first condition, but he struggles with the remaining ones. Can you help him to verify the passwords?

Input Format

First line of input contains T- number of test cases. Each test case contains a length of string. The next line contains a string.

Constraints

1<=T<=100, 1<=n<=20

Output Format

Print YES or NO.

Sample Input 0

5
4
12ac
5
123wa
9
allllmost
5
ac123
6
011679
Sample Output 0

YES
NO
YES
NO
YES
  /*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // length of the string
            String password = scanner.next(); // the password string
            
            if (isValidPassword(password)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    // Function to check if the password is valid
    public static boolean isValidPassword(String password) {
        boolean hasDigitAfterLetter = false;
        boolean validDigits = true;
        boolean validLetters = true;
        char lastType = ' '; // 'l' for letter, 'd' for digit
        
        // Separate letters and digits
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
                if (lastType == 'l') {
                    hasDigitAfterLetter = true;
                }
                lastType = 'd';
            } else if (Character.isLowerCase(c)) {
                letters.append(c);
                lastType = 'l';
            } else {
                // Invalid character other than lowercase letter or digit
                return false;
            }
        }
        
        // Check if digits are in non-decreasing order
        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) < digits.charAt(i - 1)) {
                validDigits = false;
                break;
            }
        }
        
        // Check if letters are in non-decreasing order
        for (int i = 1; i < letters.length(); i++) {
            if (letters.charAt(i) < letters.charAt(i - 1)) {
                validLetters = false;
                break;
            }
        }
        
        // Check conditions
        return !hasDigitAfterLetter && validDigits && validLetters;
    }
}*/
