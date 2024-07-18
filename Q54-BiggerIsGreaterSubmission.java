Problem
Submissions
Leaderboard
Discussions
Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

It must be greater than the original word
It must be the smallest word that meets the first condition
Example
  w = abcd

The next largest word is abcd.

Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not possible, return no answer.

Function Description

Complete the biggerIsGreater function in the editor below.

biggerIsGreater has the following parameter(s):

string w: a word
Returns
- string: the smallest lexicographically higher string possible or no answer

Input Format

The first line of input contains T, the number of test cases.
Each of the next T lines contains w.

Constraints
  1<=T<=10^5
  1<=lengthofw<=100

w will contain only letters in the range ascii[a..z].
Sample Input 0

5
ab
bb
hefg
dhck
dkhc
Sample Output 0

ba
no answer
hegf
dhkc
hcdk
Explanation 0

Test case 1:
ba is the only string which can be made by rearranging ab. It is greater.
Test case 2:
It is not possible to rearrange bb and get a greater string.
Test case 3:
hegf is the next string greater than hefg.
Test case 4:
dhkc is the next string greater than dhck.
Test case 5:
hcdk is the next string greater than dkhc.
Sample Input 1

6
lmno
dcba
dcbb
abdc
abcd
fedcbabcd
Sample Output 1

lmon
no answer
no answer
acbd
abdc
fedcbabdc

  /*import java.io.*;
import java.util.*;

class Result {

    public static String biggerIsGreater(String w) {
        char[] arr = w.toCharArray();
        
        // Step 1: Find the largest index i such that arr[i-1] < arr[i]
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // If no such index exists, the string is sorted in non-increasing order
        if (i < 0) {
            return "no answer";
        }
        
        // Step 2: Find the largest index j greater than i such that arr[i-1] < arr[j]
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: Swap characters at i and j
        swap(arr, i, j);
        
        // Step 4: Reverse the sequence from i+1 to the end
        reverse(arr, i + 1, arr.length - 1);
        
        return new String(arr);
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            String w = bufferedReader.readLine();

            String result = Result.biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
  
