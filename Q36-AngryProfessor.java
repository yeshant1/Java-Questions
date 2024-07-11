A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts.

The arrival times of the students are given as an array where:

A negative arrival time indicates the student arrived on time or early.
A positive arrival time indicates the student arrived late.
Given the arrival time of each student and a threshold number of attendees, determine if the class is cancelled.

Function Signature:

String angryProfessor(int k, List<Integer> a)
Input:

k: An integer representing the cancellation threshold (minimum number of students required on time).
a: A list of integers representing the arrival times of each student.
Output:

Return "YES" if the class is cancelled (fewer than k students arrived on time), otherwise return "NO".
Example:

Input:
k = 3
a = [-1, -3, 4, 2]

Output:
"YES"

Explanation:
The professor wants at least 3 students in attendance. Only 2 students arrived on time (arrival times: -1 and -3). Therefore, the class is cancelled.
Constraints:

The number of students (n) is between 1 and 1000.
Each arrival time in the array a is an integer between -100 and 100.
This format clearly defines the problem, specifies the function signature, provides an example, lists the constraints, and explains the expected output. This structure helps in understanding the problem requirements and provides clarity for implementing the solution.

  sol- 
  import java.util.Scanner;

public class Solution {

    // Function to determine if class is cancelled based on arrival times
    static String angryProfessor(int k, int[] a) {
        int onTimeCount = 0;
        
        // Count students who arrived on time or early
        for (int time : a) {
            if (time <= 0) {
                onTimeCount++;
            }
        }
        
        // Check if enough students arrived on time
        if (onTimeCount >= k) {
            return "NO"; // Class is not cancelled
        } else {
            return "YES"; // Class is cancelled
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of students
            int k = scanner.nextInt(); // Cancellation threshold
            
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt(); // Arrival times of students
            }
            
            // Determine if class is cancelled
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        
        scanner.close();
    }
}

or


  import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. List<Integer> a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        int onTimeCount = 0;
        
        // Count students who arrived on time or early
        for (int time : a) {
            if (time <= 0) {
                onTimeCount++;
            }
        }
        
        // Check if enough students arrived on time
        if (onTimeCount >= k) {
            return "NO"; // Class is not cancelled
        } else {
            return "YES"; // Class is cancelled
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> a = new ArrayList<>();

            String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a.add(aItem);
            }

            String result = Result.angryProfessor(k, a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

