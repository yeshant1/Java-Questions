You are given n lines of integers. Each line may contain zero or more integers. You need to answer a few queries where you retrieve the integer located at a specified position within a specified line.

Input Format:

The first line contains an integer n, denoting the number of lines.
Each of the next n lines starts with an integer m, which denotes the number of integers on that line, followed by m space-separated integers.
The following line contains an integer q, denoting the number of queries.
Each of the next q lines contains two integers, x and y, where x represents the line number (1-indexed) and y represents the position in that line (1-indexed).
Output Format:

For each query, output the integer located at position y in line x.
If x or y is out of bounds for the given input, print "ERROR!".
Constraints:

Each number will fit within a signed integer range.
Total number of integers across all lines will not exceed practical memory limits.
Sample Input:

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output:

74
52
37
ERROR!
ERROR!
This problem involves reading and managing input dynamically, storing lines of integers using ArrayList, and responding to queries efficiently.

  /*import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of lines
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create a list of lists (ArrayList of ArrayLists)
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read each line and store its integers in an ArrayList
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            int numCount = Integer.parseInt(nums[0]);
            
            ArrayList<Integer> currentLine = new ArrayList<>();
            for (int j = 1; j <= numCount; j++) {
                currentLine.add(Integer.parseInt(nums[j]));
            }
            
            lines.add(currentLine);
        }
        
        // Read number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if (x <= lines.size() && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}
*/
