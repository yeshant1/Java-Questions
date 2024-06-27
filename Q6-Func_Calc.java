Hey , Your friend is very weak in maths and he knows you are a good programmer. He wants to create a basic calculator through which he can add , subtract , multiply and divide. But the condition is you have to create a special function for each operation. And call each function in indivisual line.

Input Format

First line of input contain N.

Constraints

0<=T<=200, 0<=a,b,c,d<=1000

Output Format

Print each operation value in separated in each line.

Sample Input 0

10 20 
Sample Output 0

30
-10
200
0
  /*    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = add(a,b);
        int diff = subtract(a,b);
        int prod = multiply(a,b);
        int quotient = divide(a,b);
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quotient);

        sc.close();
    }
    
    public static int add(int a,int b){
        return a + b;
    }
    
    public static int subtract(int a,int b){
        return a - b;
    }
    
    public static int multiply(int a,int b){
        return a * b;
    }
    
    public static int divide(int a,int b){
        return a / b;
    }
}*/
