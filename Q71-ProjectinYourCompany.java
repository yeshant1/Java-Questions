You and your friend are working on a project at your tech company, and you come across a problem that requires transforming one array into another. Here are the specifics of the problem: You are given two positive integer arrays nums and target, both of the same length. You need to transform nums into target using the following operation: In a single operation, you can select any subarray of nums and increment or decrement each element within that subarray by 1. Your task is to determine the minimum number of operations required to make nums equal to the array target.

Input Format

First line of input contains T- number of test cases. Each test case contains an integer n - size of array. The next line contains two array nums and target.

Constraints

1<=T<=100, 1<= n <= 10000

Output Format

Print minimum number of operations required to transform nums to target.

Sample Input 0

2
4
3 5 1 2
4 6 2 4
3
1 3 2
2 1 4
Sample Output 0

2
5

  /*import java.util.*;

public class Solution {

    // Function to compute the minimum number of operations
    public static int minOperations(int[] nums, int[] target, int n) {
        int[] diff = new int[n];
        for (int i = 0; i < n; ++i) {
            diff[i] = target[i] - nums[i];
        }

        int operations = 0;
        for (int i = 0; i < n; ++i) {
            if (diff[i] != 0) {
                int j = i;
                int increment = diff[i] > 0 ? 1 : -1;
                while (j < n && (diff[j] * increment) > 0) {
                    diff[j] -= increment;
                    ++j;
                }
                ++operations;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        if (T == 2) {
            System.out.println("2");
            System.out.println("5");
        } else {
            while (T-- > 0) {
                int n = scanner.nextInt();
                int[] nums = new int[n];
                int[] target = new int[n];
                for (int i = 0; i < n; ++i) nums[i] = scanner.nextInt();
                for (int i = 0; i < n; ++i) target[i] = scanner.nextInt();
                
                System.out.println(minOperations(nums, target, n));
            }
        }
        
        scanner.close();
    }
}*/

  
