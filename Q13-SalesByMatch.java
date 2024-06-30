There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example  n =7 ar = [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2 . There are three odd socks left, one of each color. The number of pairs is 2.

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer n, the number of socks represented in .
The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.

Constraints  1<= n <= 100       1<= arr[i] <= 100 where 0 <= i < n

Sample Input

STDIN                       Function

9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3

  /*import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each color
        for (int color : ar) {
            countMap.put(color, countMap.getOrDefault(color, 0) + 1);
        }
        
        int pairs = 0;
        
        // Calculate pairs
        for (int count : countMap.values()) {
            pairs += count / 2;
        }
        
        return pairs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
