Hey Cipher, Your friend is inside some problem and he asks for help. You can only help by sorting an array. He gives you an array a consisting of n integers. Each integer from 1 to n appears exactly once in this array. For some indices i (1 ≤ i ≤ n - 1) it is possible to swap i-th element with (i + 1)-th, for other indices it is not possible. You may perform any number of swapping operations any order. There is no limit on the number of times you swap i-th element with (i + 1)-th (if the position is not forbidden). Can you make this array sorted in ascending order performing some sequence of swapping operations and help your friend?

Input Format

The first line contains one integer n — the number of elements in the array. The second line contains n integers a1, a2, ..., an — the elements of the array. Each integer from 1 to n appears exactly once. The third line contains a string of n - 1 characters, each character is either 0 or 1. If i-th character is 1, then you can swap i-th element with (i + 1)-th any number of times, otherwise it is forbidden to swap i-th element with (i + 1)-th.

Constraints

2 ≤ n ≤ 200000, 1 ≤ ai ≤ 200000

Output Format

If you sort the array in ascending order to help your friend then print “YES” otherwise “NO”. Print your answer without double quotes.

Sample Input 0

16
3 4 14 16 11 7 13 9 10 8 6 5 15 12 1 2
111111101111111
Sample Output 0

NO
Sample Input 1

5
1 5 4 3 2
0111
Sample Output 1

YES
  /*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        String swap = scanner.next();
        
        // Check if we can sort the array
        boolean canSort = true;
        
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                // Check if we are allowed to swap a[i] and a[i + 1]
                if (swap.charAt(i) == '0') {
                    canSort = false;
                    break;
                } else {
                    // Swap a[i] and a[i + 1] to maintain progress
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        
        // Output the result
        if (canSort) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}*/
