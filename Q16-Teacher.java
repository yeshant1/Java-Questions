You are a teacher with a class of students. Each student has a different number of books, represented by an array nums. Your goal is to ensure that every student has a number of books that is divisible by 3 so they can form groups for the reading challenge.

To achieve this, you can instruct each student to either add one book to their collection or remove one book from their collection. Your task is to figure out the minimum number of these additions or subtractions needed so that all students end up with a number of books that is a multiple of 3.

Input Format

First Line of input contains T- number of test cases. Each test case contains N- size of array. The next line contains array.

Constraints

1<=T<=100, 1<=N<=1000

Output Format

Print single integer that minimum number of operations.

Sample Input 0

2
4
1 2 3 4
3
3 6 9
Sample Output 0

3
0
  /*import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of array nums
            int[] nums = new int[N];
            
            // Reading the array nums
            for (int i = 0; i < N; i++) {
                nums[i] = scanner.nextInt();
            }
            
            int minOperations = minOperationsForDivisibility(nums);
            System.out.println(minOperations);
        }
        
        scanner.close();
    }
    
    private static int minOperationsForDivisibility(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        
        // Count numbers with remainder 0, 1, 2 when divided by 3
        for (int num : nums) {
            int remainder = num % 3;
            if (remainder == 0) {
                count0++;
            } else if (remainder == 1) {
                count1++;
            } else if (remainder == 2) {
                count2++;
            }
        }
        
        // Calculate the number of operations needed
        int operations = 0;
        
        // Check excess count1 and count2
        if (count1 > count2) {
            operations += count1 - count2; // Need to add more books to make count1 multiples of 3
            count1 = count2; // After adjusting count1, it will match count2
        } else if (count2 > count1) {
            operations += count2 - count1; // Need to remove books to make count2 multiples of 3
            count2 = count1; // After adjusting count2, it will match count1
        }
        
        // Now count1 and count2 are equal, either 0 or 1
        operations += count1 * 2; // Each count1 needs 2 operations to make it multiples of 3
        
        return operations;
    }
}

*/
