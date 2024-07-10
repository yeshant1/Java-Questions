Jack and Daniel are friends. Both of them like letters, especially uppercase ones.
They are cutting uppercase letters from newspapers, and each one of them has his collection of letters stored in a stack.

One beautiful day, Morgan visited Jack and Daniel. He saw their collections. He wondered what is the lexicographically minimal string made of those two collections. He can take a letter from a collection only when it is on the top of the stack. Morgan wants to use all of the letters in their collections.

As an example, assume Jack has collected a = [A,C,A] and Daniel has b = [B,C,F] . The example shows the top at index 0 for each stack of letters. Assemble the string as follows:

Jack	Daniel	result
ACA	BCF
CA	BCF	       A
CA	CF      	 AB
A	  CF	       ABC
A 	CF	        ABCA
     F	       ABCAC
    	      	ABCACF
Note the choice when there was a tie at CA and CF.

Function Description

Complete the morganAndString function in the editor below.

morganAndString has the following parameter(s):

string a: Jack's letters, top at index 0
string b: Daniel's letters, top at index 0 
Returns
- string: the completed string

Input Format

The first line contains the an integer , the number of test cases.

The next  pairs of lines are as follows:
- The first line contains string 
- The second line contains string .

Constraints
  1<=T<=5
  1<=|a|,|b|<=10^5

 a and b  contain upper-case letters only, ascii[A-Z].
Sample Input

2
JACK
DANIEL
ABACABA
ABACABA
Sample Output

DAJACKNIEL
AABABACABACABA
Explanation

The first letters to choose from are J and D since they are at the top of the stack. D is chosen and the options now are J and A. A is chosen. Then the two stacks have J and N, so J is chosen. The current string is DA. Continue this way to the end to get the string.
  import java.io.*;
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
     * Complete the 'morganAndString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String morganAndString(String a, String b) {
    // Write your code here
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int m = a.length(), n = b.length();

        while (i < m && j < n) {
            if (a.charAt(i) < b.charAt(j)) {
                result.append(a.charAt(i));
                i++;
            } else if (a.charAt(i) > b.charAt(j)) {
                result.append(b.charAt(j));
                j++;
            } else {
                // Characters are equal, use the smallest lexicographical suffix
                if (a.substring(i).compareTo(b.substring(j)) <= 0) {
                    result.append(a.charAt(i));
                    i++;
                } else {
                    result.append(b.charAt(j));
                    j++;
                }
            }
        }

        // Append remaining characters
        if (i < m) {
            result.append(a.substring(i));
        }
        if (j < n) {
            result.append(b.substring(j));
        }

        return result.toString();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.morganAndString(a, b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
