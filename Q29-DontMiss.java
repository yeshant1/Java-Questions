Your friend Harish and you attend a DSA lecture at Cipher Schools . Lecture lasts n minutes. Mentor tells ai DSA concept during the i-th minute. Harish is really interested in DSA, though it is so hard to stay awake for all the time of lecture. You are given an array t of Harish's behaviour. If Harish is asleep during the i-th minute of the lecture then ti will be equal to 0, otherwise it will be equal to 1. When Harish is awake he writes down all the DSA concepts he is being told — ai during the i-th minute. Otherwise he writes nothing. You know some secret technique to keep Harish awake for k minutes straight. However you can use it only once. You can start using it at the beginning of any minute between 1 and n - k + 1. If you use it on some minute i then Harish will be awake during minutes j such that and will write down all the DSA concepts that meteor tells.. Your task is to calculate the maximum number of DSA concepts Harish will be able to write down if you use your technique only once to wake him up.

Input Format

The first line of the input contains two integer numbers n and k — the duration of the lecture in minutes and the number of minutes you can keep Harish awake. The second line of the input contains n integer numbers a1, a2, ... an — the number of DSA concept mentors tells during the i-th minute. The third line of the input contains n integer numbers t1, t2, ... tn — type of Harish's behaviour at the i-th minute of the lecture.

Constraints

1 ≤ k ≤ n ≤ 1000000, 1 ≤ ai ≤ 100000, 0 ≤ ti ≤ 1

Output Format

Print only one integer — the maximum number of DSA concepts Harish will be able to write down if you use your technique only once to wake him up.

Sample Input 0

6 6
1 3 5 2 5 4 
1 1 0 1 0 0
Sample Output 0

20

  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read the number of DSA concepts taught each minute
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Read Harish's behavior
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        
        // Calculate the initial sum of concepts when Harish is awake
        int initialSum = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                initialSum += a[i];
            }
        }
        
        // Calculate the additional concepts Harish could write if awake during k consecutive minutes
        int maxExtraConcepts = 0;
        int currentExtraConcepts = 0;
        
        // Calculate the initial extra concepts for the first window of size k
        for (int i = 0; i < k; i++) {
            if (t[i] == 0) {
                currentExtraConcepts += a[i];
            }
        }
        maxExtraConcepts = currentExtraConcepts;
        
        // Use a sliding window to calculate max extra concepts for any window of size k
        for (int i = k; i < n; i++) {
            if (t[i - k] == 0) {
                currentExtraConcepts -= a[i - k];
            }
            if (t[i] == 0) {
                currentExtraConcepts += a[i];
            }
            maxExtraConcepts = Math.max(maxExtraConcepts, currentExtraConcepts);
        }
        
        // The total maximum concepts Harish can write
        int maxTotalConcepts = initialSum + maxExtraConcepts;
        System.out.println(maxTotalConcepts);
    }
}
