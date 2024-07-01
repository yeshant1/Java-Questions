You are given an array of integers in which elements are from 1 to n. You have to find if it is possible to sort an array or not by applying some operations. Choose any index i which lies between 2 to n-1 and a[i-1] a[i+1].

Input Format

First line of input contains T-number of test cases. Each test case contains N- size of array. The next line contains an array.

Constraints

1<=T<=100, 3<=N<=1000

Output Format

If it is possible to sort print YES otherwise NO.

Sample Input 0

6
3
1 2 3
5
1 3 2 5 4
5
5 4 3 2 1
3
3 1 2
4
2 3 1 4
5
5 1 2 3 4
Sample Output 0

YES
YES
NO
NO
NO
NO
  /*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        scanner.nextLine(); // consume newline after T
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // size of array
            int[] array = new int[N];
            
            // Reading the array elements
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            
            // Check if array can be sorted
            boolean possibleToSort = canSortArray(array);
            
            // Print result for current test case
            if (possibleToSort) {
                System.out.println("YES");
} else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    public static boolean canSortArray(int[] array) {
        int N = array.length;
        
        for (int i = 1; i < N - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
}
*/
