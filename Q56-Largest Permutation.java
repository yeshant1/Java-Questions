Problem
Submissions
Leaderboard
Discussions
You are given an unordered array of unique integers incrementing from . You can swap any two elements a limited number of times. Determine the largest lexicographical value array that can be created by executing no more than the limited number of swaps.

Example
  arr = [1,2,3,4]
  k = 1


The following arrays can be formed by swapping the  with the other elements:

[2,1,3,4]
[3,2,1,4]
[4,2,3,1]
The highest value of the four (including the original) is [4,2,3,1] . If k>=2 , we can swap to the highest possible value: [4,3,2,1] .

Function Description

Complete the largestPermutation function in the editor below. It must return an array that represents the highest value permutation that can be formed.

largestPermutation has the following parameter(s):

int k: the maximum number of swaps
int arr[n]: an array of integers
Input Format

The first line contains two space-separated integers  and , the length of  and the maximum swaps that can be performed. The second line contains  distinct space-separated integers from 1 to n  as arr[i] where . 1<=arr[i]<=n

Constraints
  1<=n<=10^5
  1<=k<=10^9



Output Format

Print the lexicographically largest permutation you can make with at most k  swaps.
Sample Input 0

STDIN       Function
-----       --------
5 1         n = 5, k = 1
4 2 3 5 1   arr = [4, 2, 3, 5, 1]
Sample Output 0

5 2 3 4 1
Explanation 0

You can swap any two numbers in [4,2,3,5,1]  and see the largest permutation is [5,2,3,4,1]

Sample Input 1

3 1
2 1 3
Sample Output 1

3 1 2
Explanation 1

With 1 swap we can get [1,2,3],[3,1,2]  and [2,3,1]. Of these,[3,1,2]  is the largest permutation.

Sample Input 2

2 1
2 1
Sample Output 2

2 1
Explanation 2

We can see that [2,1]  is already the largest permutation. We don't make any swaps.
  /*import java.io.*;
import java.util.*;

class Result {

    public static int maximumToys(List<Integer> prices, int k) {
        // Convert list to array for sorting
        int[] pricesArray = new int[prices.size()];
        for (int i = 0; i < prices.size(); i++) {
            pricesArray[i] = prices.get(i);
        }
        
        // Sort prices in ascending order
        Arrays.sort(pricesArray);
        
        int count = 0;
        int totalSpent = 0;
        
        // Iterate through sorted prices
        for (int price : pricesArray) {
            if (totalSpent + price <= k) {
                totalSpent += price;
                count++;
            } else {
                break; // No need to check further, as subsequent prices will only increase
            }
        }
        
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
