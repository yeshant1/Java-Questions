Imagine you are working on a project for a theme park that has a circular carousel decorated with red and blue lights. The lights are arranged in a circle, and their colors are represented in an array where each light is either red or blue. The park management wants to know how many alternating groups of lights are present. An alternating group is defined as three contiguous lights where the middle light has a different color from its left and right neighbors. Given that the lights are arranged in a circle, the first and last lights are considered adjacent. You are given an array colors where: colors[i] == 0 means the light at position i is red. colors[i] == 1 means the light at position i is blue. Your task is to determine the number of alternating groups of lights.

Input Format

First line of input contains T- number of test cases. Each test cases contains n - size of colors and in next line contains colors.

Constraints

1<=T<=100, 1<=size of colors<=10000,

Output Format

Print single integer.

Sample Input 0

2
3
1 1 1
5
0 1 0 0 1
Sample Output 0

0
3

  /*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // size of colors array
            int[] colors = new int[n];
            
            for (int i = 0; i < n; i++) {
                colors[i] = scanner.nextInt();
            }
            
            // Count alternating groups
            int count = countAlternatingGroups(colors);
            
            System.out.println(count);
        }
        
        scanner.close();
    }
    
    private static int countAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        
        // Handle edge case where n < 3
        if (n < 3) {
            return 0;
        }
        
        // Check each triplet of consecutive lights
        for (int i = 0; i < n; i++) {
            int left = colors[(i + n - 1) % n];  // color of the light to the left (circular index)
            int current = colors[i];              // color of the current light
            int right = colors[(i + 1) % n];      // color of the light to the right (circular index)
            
            // Check if it forms an alternating group
            if ((left != current) && (current != right)) {
                count++;
            }
        }
        
        return count;
    }
}
*/
