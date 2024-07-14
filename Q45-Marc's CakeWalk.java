Problem Statement:
You are given an array of integers, where each integer represents a stock price on a given day. You need to find the maximum profit you can achieve from buying and selling stocks on those days. You can only make one transaction (buy once and sell once), and you cannot sell a stock before you buy one.

Write a function maxProfit that takes in an array of integers prices where prices[i] is the price of a stock on the i-th day. The function should return the maximum profit you can achieve from this transaction. If no profit can be made, return 0.

Example 1:

Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
Example 2:

Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: In this case, no transaction is done, sothe maximum profit = 0.
Constraints:

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
Function Signature:
public static int maxProfit(int[] prices)
Task:
Implement the maxProfit function to solve the above problem. You can assume the input array prices is non-empty.

  /*import java.util.Arrays;

public class Solution {
    static long marcsCakewalk(int[] calorie) {
        // Sort the array in descending order
        Arrays.sort(calorie);
        // Reverse the sorted array to get descending order
        reverse(calorie);

        // Calculate minimum miles
        long miles = 0;
        for (int i = 0; i < calorie.length; i++) {
            miles += (long) (calorie[i] * Math.pow(2, i));
        }

        return miles;
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] calorie = {1, 3, 2};
        System.out.println(marcsCakewalk(calorie)); // Output: 11

        int[] calorie2 = {7, 4, 9, 6};
        System.out.println(marcsCakewalk(calorie2)); // Output: 79
    }
}
*/
