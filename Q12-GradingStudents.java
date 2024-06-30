Question:

HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round up to the next multiple of 5.
If the value of the grade is less than 38, no rounding occurs as the result will still be a failing grade.
Given the initial value of grades for each of Sam's students, write code to automate the rounding process.

Function Description:

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

List<Integer> grades: the grades before rounding
Returns:

List<Integer>: the grades after rounding as appropriate
Input Format:

The first line contains an integer, gradesCount, the number of students.
Each subsequent line i (where 0 ≤ i < gradesCount) contains an integer, grades[i], representing the grade for student i.
Constraints:

1 ≤ gradesCount ≤ 100
0 ≤ grades[i] ≤ 100
Sample Input:

4
73
67
38
33
Sample Output:

75
67
40
33
Implement the gradingStudents function in Java to automate the rounding process based on the provided rules.

  /*import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        
        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade); // No rounding if less than 38
            } else {
                int nextMultipleOf5 = (grade / 5 + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    roundedGrades.add(nextMultipleOf5); // Round up if difference < 3
                } else {
                    roundedGrades.add(grade); // Otherwise, keep the grade as it is
                }
            }
        }
        
        return roundedGrades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
