You are given an array nums containing n integers. Find the majority element in the array. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Write a function findMajorityElement to solve the problem. The function should return the majority element.

Example 1:

Input: nums = [3, 2, 3]
Output: 3
Explanation: The majority element is 3 because it appears twice which is more than ⌊3 / 2⌋ = 1 times.
Example 2:

Input: nums = [2, 2, 1, 1, 1, 2, 2]
Output: 2
Explanation: The majority element is 2 because it appears four times which is more than ⌊7 / 2⌋ = 3 times.
Constraints:

1 <= n <= 5 * 10^4
-10^9 <= nums[i] <= 10^9
Function Signature:
public static int findMajorityElement(int[] nums)
Task:
Implement the findMajorityElement function to solve the above problem. You may assume that the majority element always exists in the array.

/*import java.util.*;

class Result {

    public static String gridChallenge(List<String> grid) {
        int n = grid.size();
        int m = grid.get(0).length();
        
        // Convert each row to sorted char arrays
        char[][] sortedGrid = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] rowChars = grid.get(i).toCharArray();
            Arrays.sort(rowChars);
            sortedGrid[i] = rowChars;
        }
        
        // Check columns
        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                if (sortedGrid[row][col] < sortedGrid[row - 1][col]) {
                    return "NO";
                }
            }
        }
        
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        scanner.nextLine(); // consume newline after int
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // number of rows (same as number of columns)
            scanner.nextLine(); // consume newline after int
            
            List<String> grid = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                grid.add(scanner.nextLine());
            }
            
            String result = Result.gridChallenge(grid);
            System.out.println(result);
        }
        
        scanner.close();
    }
}
*/
