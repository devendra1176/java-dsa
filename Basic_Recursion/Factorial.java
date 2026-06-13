/*
You are given an integer n. Return the value of n! or n factorial.


Factorial of a number is the product of all positive integers less than or equal to that number.

Example 1

Input: n = 2

Output: 2

Explanation: 2! = 1 * 2 = 2.

Example 2

Input: n = 0

Output: 1

Explanation: 0! is defined as 1.

*/

public class Factorial {
    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive call with n decremented by 1
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}

/*
Explanation:
1. The factorial method takes an integer n as input and returns the factorial of n.
2. The base case is defined for n = 0 and n = 1, where
 the factorial is 1.
3. For n greater than 1, the method recursively calls itself with n decremented by 1 
 and multiplies it with n to calculate the factorial.
4. The main method demonstrates how to call the factorial method and prints the result.
*/