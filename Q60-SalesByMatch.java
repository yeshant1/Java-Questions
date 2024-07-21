There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example
  n = 7
  ar = [1,2,1,2,1,3,2]


There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in ar .
The second line contains n space-separated integers, ar[i] , the colors of the socks in the pile.

Constraints
  1<=n<=100
  1<=ar[i]<=100 where o<=i<=n

 where 
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3
Explanation

sock.png

There are three pairs of socks.

  /*import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
        // HashMap to store counts of each color
        Map<Integer, Integer> colorCount = new HashMap<>();
        
        // Count each color
        for (int color : ar) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }
        
        // Calculate pairs
        int pairs = 0;
        for (int count : colorCount.values()) {
            pairs += count / 2;
        }
        
        return pairs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

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


  
