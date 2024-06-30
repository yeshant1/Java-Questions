Consider the array nums = [-3, 2, -3, 4, 2], which represents elevation changes along a hiking trail. To ensure that your energy level never falls below 1, you need to find the smallest positive starting energy level. In this example, if you start with an energy level of 5: Start at 5 Step 1: 5 + (-3) = 2 Step 2: 2 + 2 = 4 Step 3: 4 + (-3) = 1 Step 4: 1 + 4 = 5 Step 5: 5 + 2 = 7 With a starting energy level of 5, your energy never drops below 1 at any step. If the array is nums = [1, 2, 3], the minimum starting energy level is 1, as the elevation changes are all positive and your energy level will always stay above 1. Find the minimum positive startValue such that your energy level never drops below 1 during your journey.

Input Format

First line of input contains T- number of test cases. Each test case contains the N- size of nums array . The next Line contains nums.

Constraints

1<=T<=100, 1<=N<=100, -50<=nums[i] <=50

Output Format

Print single integer.
  /*import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of nums array
            int[] nums = new int[N];
            
            // Reading the array nums
            for (int i = 0; i < N; i++) {
                nums[i] = scanner.nextInt();
            }
            
            int startValue = findMinStartValue(nums);
            System.out.println(startValue);
        }
        
        scanner.close();
    }
    
    private static int findMinStartValue(int[] nums) {
        int startValue = 1; // Minimum positive startValue
        int currentEnergy = 0;
        
        for (int num : nums) {
            currentEnergy += num;
            
            // Check if currentEnergy drops below 1
            if (currentEnergy < 1) {
                startValue += (1 - currentEnergy); // Increase startValue to cover the deficit
                currentEnergy = 1; // Reset currentEnergy to 1 after adjustment
            }
        }
        
        return startValue;
    }
}
*/
