You want to go to your friend home and you reach the entry gate of society but your friend’s society is very complex means society is look like grid of n row and m column and entry gate of society is 0th row and 0th column and each house at their number and your friend give their own house number x. You have to reach the house whose number is x but society is very complex then there is a possibility of not reaching your friend’s home. Now you have to say Yes or No. if you reach then print YES otherwise NO. Solve this in log(n*m)

Input Format

First line of input contains T- number of test cases. Each test case contains n, m, target. The next line contains a 2D array.

Constraints

1<=T<=100, 1<=n,m<=10000

Output Format

Print YES or NO.

Sample Input 0

1
5 5 30
26    2    26    61    20    
93    43    50    65    77    
1    91    60    80    73    
43    73    63    95    32    
92    79    59    22    21
Sample Output 0

NO

  /*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns
            int target = scanner.nextInt(); // Target house number
            
            int[][] grid = new int[n][m];
            
            // Read the grid
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }
            
            // Perform binary search to find target
            boolean found = false;
            
            // Binary search in rows
            for (int i = 0; i < n; i++) {
                // Binary search in current row
                int low = 0, high = m - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (grid[i][mid] == target) {
                        found = true;
                        break;
                    } else if (grid[i][mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                if (found) break;
            }
            
            // Output result
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
*/
  
