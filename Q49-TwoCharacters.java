Given a string, remove characters until the string is made up of any two alternating characters. When you choose a character to remove, all instances of that character must be removed. Determine the longest string possible that contains just two alternating letters.

Example
s = 'abaacdabd'

Delete a, to leave bcdbd. Now, remove the character c to leave the valid string bdbd with a length of 4. Removing either b or d at any point would not result in a valid string. Return 4 .

Given a string s, convert it to the longest possible string t made up only of alternating characters. Return the length of string t . If no string  can be formed, return 0 .

Function Description

Complete the alternate function in the editor below.

alternate has the following parameter(s):

string s: a string
Returns.

int: the length of the longest valid string, or 0 if there are none
Input Format

The first line contains a single integer that denotes the length of s.
The second line contains string s.

Constraints 
  1 <= length of s <= 1000
  s[i] belongs ascii[a-z]

Sample Input

STDIN       Function
-----       --------
10          length of s = 10
beabeefeab  s = 'beabeefeab'
Sample Output

5
Explanation

The characters present in s are a, b, e, and f. This means that  must consist of two of those characters and we must delete two others. Our choices for characters to leave are [a,b], [a,e], [a, f], [b, e], [b, f] and [e, f].

If we delete e and f, the resulting string is babab. This is a valid  as there are only two distinct characters (a and b), and they are alternating within the string.

If we delete a and f, the resulting string is bebeeeb. This is not a valid string  because there are consecutive e's present. Removing them would leave consecutive b's, so this fails to produce a valid string t.

Other cases are solved similarly.

babab is the longest string we can create.

  /*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
            // Step 1: Identify distinct characters
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }
        
        // Step 2: Generate all pairs of distinct characters
        List<Character> charList = new ArrayList<>(charSet);
        int maxLen = 0;
        
        // Step 3: Check each pair
        for (int i = 0; i < charList.size(); i++) {
            for (int j = i + 1; j < charList.size(); j++) {
                char char1 = charList.get(i);
                char char2 = charList.get(j);
                
                // Step 4: Construct a new string with only char1 and char2
                StringBuilder sb = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (c == char1 || c == char2) {
                        sb.append(c);
                    }
                }
                
                // Step 5: Check if the constructed string is alternating
                if (isAlternating(sb.toString())) {
                    maxLen = Math.max(maxLen, sb.length());
                }
            }
        }
        
        return maxLen;
    }
    
    // Helper method to check if a string is alternating
    public static boolean isAlternating(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                return false;
            }
        }
        return true;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
