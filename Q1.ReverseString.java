Q-You are given a string you have to reverse it. Write your own function for reverse. Don't use the inbuilt function. Try to reverse in constant extra space.

Input Format

First line of input contains the T- number of test cases. Each test case contains a String.

Constraints

0<=T<=100, 1<=length of string<=10000

Output Format

Print reverse string.

Sample Input 0

2
Cipher
Schools
Sample Output 0

rehpiC
sloohcS

/*
import java.util.Scanner;

public class Main {
    // Function to reverse a string in-place
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move pointers towards each other
            left++;
            right--;
        }
        
        // Convert char array back to string
        return new String(chars);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after T
        
        for (int t = 0; t < T; t++) {
            String s = scanner.nextLine();
            String reversed = reverseString(s);
            System.out.println(reversed);
        }
        
        scanner.close();
    }
}
*/
