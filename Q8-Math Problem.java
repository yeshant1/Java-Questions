You are solving your maths assignments from your college and find some pattern of your assignment. Pattern is most of the problem about a+b whole square and a-b whole square. You are very smart and write special functions for both equations.

Input Format

First line of input contains T- number of test cases. Second line contains two integers a and b.

Constraints

0<=T<=200; 0<=A, B<=10000

Output Format

Print two space separated integers of answer a+b whole square and a-b whole square.

Sample Input 0

3
1 10
4 20
2 15
Sample Output 0

121 81
576 256
289 169

/*import java.util.Scanner;

public class MathsAssignments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sumSquare = (a + b) * (a + b);
            int diffSquare = (a - b) * (a - b);

            System.out.println(sumSquare + " " + diffSquare);
        }

        scanner.close();
    }
}*/
