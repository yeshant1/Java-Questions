Your friend is the organiser of an event. In this event they have to give 10 problems of rating A to L. They run the event for m round. They have a question bank of n problems and you have to tell how many extra problems he needs to organise m round event.

Input Format

First line of input contains T- number of test cases. Each test case contains two integers n and m. In the next line given string.

Constraints

1<=T<=50, 1<=n,m<=100

Output Format

Print single integer.

Sample Input 0

3
10 1
BGECDCBDED
10 2
BGECDCBDED
9 1
BBCDEFFGG
Sample Output 0

7
15
6
  /*import java.util.Scanner;

public class EventProblemCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();  // Number of problems in question bank
            int m = scanner.nextInt();  // Number of rounds
            scanner.nextLine();  // Consume newline
            String problems = scanner.nextLine();

            // Calculate the total problems needed for each rating (A to L)
            int totalNeeded = 10 * m;

            // Count occurrences of each character in the string
            int[] charCount = new int[12];  // To count A to L
            for (char ch : problems.toCharArray()) {
                if (ch >= 'A' && ch <= 'L') {
                    charCount[ch - 'A']++;
                }
            }

            // Calculate extra problems needed
            int extraNeeded = 0;
            for (int count : charCount) {
                if (count < m) {
                    extraNeeded += (m - count);
                }
            }

            System.out.println(extraNeeded);
        }

        scanner.close();
    }
}*/
  
