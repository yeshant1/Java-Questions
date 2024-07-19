Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money. Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.

Note Each toy can be purchased only once.

Example
  prices = [1,2,3,4]
  k = 7


The budget is 7 units of currency. He can buy items that cost [1,2,3] for 6 , or [3,4] for 7 units. The maximum is 3 items.

Function Description

Complete the function maximumToys in the editor below.

maximumToys has the following parameter(s):

int prices[n]: the toy prices
int k: Mark's budget
Returns

int: the maximum number of toys
Input Format

The first line contains two integers,  and , the number of priced toys and the amount Mark has to spend.
The next line contains  space-separated integers prices[i]

Constraints
1<=n<=10^5
1<=k=10^9
1<=prices[i]<=10^9



A toy can't be bought multiple times.

Sample Input

7 50
1 12 5 111 200 1000 10
Sample Output

4
Explanation

He can buy only  toys at most. These toys have the following prices: 1,12,5,10 .

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

  
