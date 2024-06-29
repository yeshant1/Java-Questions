Write the following code in your editor below:

A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be public.

Input Format

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20

/*class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No need to override add method since it's already implemented in the superclass Arithmetic
}

public class Solution {
    public static void main(String[] args) {
        // Instantiate Adder object
        Adder adder = new Adder();

        // Print the superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // Test the add method of Adder
        System.out.println(adder.add(42, 13));
    }
}
*/
