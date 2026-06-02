/*
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

Example 1

Input : N = 4

Output : 10

Explanation : first four natural numbers are 1, 2, 3, 4.

Sum is 1 + 2 + 3 + 4 => 10.

Example 2

Input : N = 2

Output : 3

Explanation : first two natural numbers are 1, 2.

Sum is 1 + 2 => 3.

*/

public class Sum_of_First_N_Numbers {
    public static int sumOfFirstNNumbers(int n) {
        // Base case: If n is 0, return 0
        if (n == 0) {
            return 0;
        }

        // Recursive call with n decremented by 1 and add n to the result
        return n + sumOfFirstNNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        int result = sumOfFirstNNumbers(n);
        System.out.println(result); // Output: 10
    }
}


