Q-You are given an array of strings. You have to find the sum of the given strings.

Input Format

First line of input contains T- number of test cases. Each test case contains N- number of strings. And in the next line given string.

Constraints

String contains only 0 to 9 values as characters.

Output Format

Print a single integer total sum of array.
Sample Input 0

2
2
22 22
2
2 2
Sample Output 0

44
4


  /*
    Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of strings in the current test case
            scanner.nextLine(); // Consume the newline
            
            String[] strings = scanner.nextLine().split(" "); // Read all strings and split by space
            
            int sum = 0;
            for (String str : strings) {
                sum += Integer.parseInt(str); // Convert each string to integer and sum them up
            }
            
            System.out.println(sum); // Output the sum for the current test case
        }
        
        scanner.close();
*/
