Imagine you have a seesaw with several children sitting at various positions along its length. You want to find the position on the seesaw where you can place a pivot so that the seesaw balances perfectly. The weights of the children are represented as integers in an array. Your task is to find the position where the sum of the weights on the left side of the pivot is equal to the sum of the weights on the right side.

For example, given the array nums = [1, 7, 3, 6, 5, 6], the pivot index is 3 because the sum of the numbers to the left of index 3 (1 + 7 + 3 = 11) is equal to the sum of the numbers to the right of index 3 (5 + 6 = 11).

If the array is nums = [1, 2, 3], there is no pivot index where the sums of the left and right sides are equal, so the function should return -1.

Input Format

First Line of input contains T- number of test cases. Each test case contains N - size of array nums . The next line contains nums.

Constraints

1<=T<=100, 1<=N<=10000

Output Format

Print single integer.
  /*import java.util.Scanner;

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
            
            int pivotIndex = findPivotIndex(nums);
            System.out.println(pivotIndex);
        }
        
        scanner.close();
    }
    
    private static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1; // No pivot index found
    }
}
*/
