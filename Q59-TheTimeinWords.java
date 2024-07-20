Given the time in numerals we may convert it into words, as shown below:

At minutes = 0 , use o' clock. For 1<=minutes<=30, use past, and for 30 < minutes use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

Function Description

Complete the timeInWords function in the editor below.

timeInWords has the following parameter(s):

int h: the hour of the day
int m: the minutes after the hour
Returns

string: a time string as described
Input Format

The first line contains , the hours portion The second line contains , the minutes portion

Constraints
  1<=h<=12
  0<=m<=60

Sample Input 0

5
47
Sample Output 0

thirteen minutes to six
Sample Input 1

3
00
Sample Output 1

three o' clock
Sample Input 2

7
15
Sample Output 2

quarter past seven

  /*import java.io.*;

public class Solution {

    static String[] numbers = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
        "eighteen", "nineteen", "twenty"
    };
    
    static String timeInWords(int h, int m) {
        if (m == 0) {
            return numbers[h] + " o' clock";
        } else if (m == 15) {
            return "quarter past " + numbers[h];
        } else if (m == 30) {
            return "half past " + numbers[h];
        } else if (m == 45) {
            return "quarter to " + numbers[(h % 12) + 1];
        } else if (m == 1) {
            return "one minute past " + numbers[h];
        } else if (m < 30) {
            return numbers[m] + (m != 1 ? " minutes" : " minute") + " past " + numbers[h];
        } else {
            return numbers[60 - m] + (m != 59 ? " minutes" : " minute") + " to " + numbers[(h % 12) + 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
