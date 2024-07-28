Imagine you are working on a security feature for a messaging app. One of the tasks is to encrypt user messages to protect their privacy. You are given a string s representing a message and an integer k representing a shift value. Your task is to encrypt the string using the following algorithm: For each character c in s, replace c with the kth character after c in the alphabet (cycling back to the start if necessary).

Input Format

First Line of input contains T- number of test cases. Each test case contains integer k and a string .

Constraints

1<=T<=100, 1<=Length of string <=1000

Output Format

Print new string.

Sample Input 0

2
3 dart
1 aaa
Sample Output 0

tdar
aaa

  /*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            char[] temp = new char[s.length()];
            
            for (int i = 0; i < s.length(); i++) {
                temp[(i - n + s.length()) % s.length()] = s.charAt(i);
            }
            
            System.out.println(new String(temp));
        }
        
        scanner. Close();
    }
}*/
