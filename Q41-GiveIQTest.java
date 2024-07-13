You go to your friend's home. Your friend wants to check your IQ level by giving a problem. Problem Statement is you are given a string that contains parenthesis ‘(‘ and ‘)’ only. You have to find the longest valid parentheses of the substring.

Input Format

First line of input contains T-number of test cases. Each test case contains a string.

Constraints

1<=T<=100, 1<=length of string <=1000

Output Format

Print single integer that is maximum length of substring.

Sample Input 0

2
()()()
(()()
Sample Output 0

6
4

  /*import java.util.*;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize stack with a base index
        
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(i); // Push index of '('
            } else { // c == ')'
                stack.pop(); // Pop the top element
                
                if (!stack.isEmpty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i); // Push current index as a base for next substring
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline after integer input
        
        while (T-- > 0) {
            String input = scanner.nextLine();
            int maxLength = longestValidParentheses(input);
            System.out.println(maxLength);
        }
        
        scanner.close();
    }
}
*/
