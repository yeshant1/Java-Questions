Your friend gives you an array of integers and they ask you to find the element that appears more than n/3 times (take floor value of n/3).

Input Format

First line of input contains T- number of test cases. Each test case contains N- size of array. The next line contains an array.

Constraints

1<=T<=100, 3<=N<=10000

Output Format

Print single integer element that appears more than n/3 times.

Sample Input 0

2
5 
1 2 1 3 4
6
2 2 3 4 2 2
Sample Output 0

1 
2
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // size of the array
            int[] array = new int[N];
            
            // Reading the array elements
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            
            // Finding the element that appears more than n/3 times
            List<Integer> result = findMajorityElement(array);
            
            // Printing the result
            for (int num : result) {
                System.out.println(num);
            }
        }
        
        scanner.close();
    }
    
    public static List<Integer> findMajorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        
        // Phase 1: Find the potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Phase 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3 && candidate1 != candidate2) {
            result.add(candidate2);
        }
        
        return result;
    }
}
*/
