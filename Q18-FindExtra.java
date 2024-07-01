You are given two strings s1 and s2. String s2 is created by shuffling s1 and adding one extra character in s2. Find that extra character in s2.

Input Format

First line of input contains T- number of test cases. Each test case contains two strings s1 and s2.

Constraints

1<=T<=100, 2<=length of s1 and s2 <=10000

Output Format

Print extra character in string s2.

Sample Input 0

5
cxdIXdTDrj ddTrXjcDIxY
YtW2puhaLc c2WaLuhtYps
efQ9I6d6T7 Id6e7fQ69Tf
AdxEsvnjxF jEdxFxnsvAJ
uWmvmgd4RM RMmvudWmg4s
Sample Output 0

Y
s
f
J
s
  /*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        scanner.nextLine(); // consume the newline after T
        
        while (T-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            
            char extraChar = findExtraCharacter(s1, s2);
            System.out.println(extraChar);
        }
        
        scanner.close();
    }
    
    public static char findExtraCharacter(String s1, String s2) {
        int result = 0;
        
        // XOR all characters in s1 and s2
        for (char ch : s1.toCharArray()) {
            result ^= ch;
        }
        for (char ch : s2.toCharArray()) {
            result ^= ch;
        }
        
        // Convert result to char
        return (char) result;
    }
}
*/
