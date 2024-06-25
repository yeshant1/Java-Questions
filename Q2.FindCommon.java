Q-You are given two strings s and t. You have to find the number of common characters in s and t.

Input Format

First line of input contains T- number of test cases. Each test case contains two strings s and t respectively.

Constraints

1<=T<=100, 1<= legth of s and t<=100

Output Format

Print number of common characters.

  /*
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); // consume newline after T
        
        for (int t = 0; t < T; t++) {
            String s = scanner.next();
            String tStr = scanner.next();
            
            // Frequency arrays for characters 'a' to 'z'
            int[] freqS = new int[26];
            int[] freqT = new int[26];
            
            // Count frequencies in string s
            for (char ch : s.toCharArray()) {
                freqS[ch - 'a']++;
            }
            
            // Count frequencies in string t
            for (char ch : tStr.toCharArray()) {
                freqT[ch - 'a']++;
            }
            
            // Calculate number of common characters
            int commonCount = 0;
            for (int i = 0; i < 26; i++) {
                commonCount += Math.min(freqS[i], freqT[i]);
            }
            
            System.out.println(commonCount);
        }
        
        scanner.close();
    }
}
*/
